package typings.mapboxMapboxSdk.mapMatchingMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapMatchingService extends js.Object {
  
  def getMatch(request: MapMatchingRequest): MapiRequest = js.native
}
object MapMatchingService {
  
  @scala.inline
  def apply(getMatch: MapMatchingRequest => MapiRequest): MapMatchingService = {
    val __obj = js.Dynamic.literal(getMatch = js.Any.fromFunction1(getMatch))
    __obj.asInstanceOf[MapMatchingService]
  }
  
  @scala.inline
  implicit class MapMatchingServiceOps[Self <: MapMatchingService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetMatch(value: MapMatchingRequest => MapiRequest): Self = this.set("getMatch", js.Any.fromFunction1(value))
  }
}
