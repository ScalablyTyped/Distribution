package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.metaDotfolder
import typings.iobroker.iobrokerStrings.metaDotuser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaCommon extends ObjectCommon {
  
  // Make it possible to narrow the object type using the custom property
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  // Meta objects have to additional CommonTypes
  var `type`: CommonType | metaDotuser | metaDotfolder = js.native
}
object MetaCommon {
  
  @scala.inline
  def apply(name: StringOrTranslated, `type`: CommonType | metaDotuser | metaDotfolder): MetaCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaCommon]
  }
  
  @scala.inline
  implicit class MetaCommonOps[Self <: MetaCommon] (val x: Self) extends AnyVal {
    
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
    def setType(value: CommonType | metaDotuser | metaDotfolder): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
