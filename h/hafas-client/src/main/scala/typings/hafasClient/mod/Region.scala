package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A region is a group of stations, for example a metropolitan area or a geographical or cultural region.
  */
@js.native
trait Region extends js.Object {
  
  var id: String = js.native
  
  var name: String = js.native
  
  /** station ids */
  var stations: js.Array[String] = js.native
  
  var `type`: region = js.native
}
object Region {
  
  @scala.inline
  def apply(id: String, name: String, stations: js.Array[String], `type`: region): Region = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stations = stations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStationsVarargs(value: String*): Self = this.set("stations", js.Array(value :_*))
    
    @scala.inline
    def setStations(value: js.Array[String]): Self = this.set("stations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: region): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
