package typings.mapboxMapboxSdk.matrixMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatrixService extends js.Object {
  
  /**
    * Get a duration and/or distance matrix showing travel times and distances between coordinates.
    * @param request
    */
  def getMatrix(request: MatrixRequest): MapiRequest = js.native
}
object MatrixService {
  
  @scala.inline
  def apply(getMatrix: MatrixRequest => MapiRequest): MatrixService = {
    val __obj = js.Dynamic.literal(getMatrix = js.Any.fromFunction1(getMatrix))
    __obj.asInstanceOf[MatrixService]
  }
  
  @scala.inline
  implicit class MatrixServiceOps[Self <: MatrixService] (val x: Self) extends AnyVal {
    
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
    def setGetMatrix(value: MatrixRequest => MapiRequest): Self = this.set("getMatrix", js.Any.fromFunction1(value))
  }
}
