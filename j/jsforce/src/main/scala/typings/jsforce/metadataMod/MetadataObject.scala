package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataObject extends js.Object {
  
  var childXmlNames: js.UndefOr[js.Array[String]] = js.native
  
  var directoryName: js.UndefOr[String] = js.native
  
  var inFolder: js.UndefOr[Boolean] = js.native
  
  var metaFile: js.UndefOr[Boolean] = js.native
  
  var suffix: js.UndefOr[String] = js.native
  
  var xmlName: String = js.native
}
object MetadataObject {
  
  @scala.inline
  def apply(xmlName: String): MetadataObject = {
    val __obj = js.Dynamic.literal(xmlName = xmlName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataObject]
  }
  
  @scala.inline
  implicit class MetadataObjectOps[Self <: MetadataObject] (val x: Self) extends AnyVal {
    
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
    def setXmlName(value: String): Self = this.set("xmlName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildXmlNamesVarargs(value: String*): Self = this.set("childXmlNames", js.Array(value :_*))
    
    @scala.inline
    def setChildXmlNames(value: js.Array[String]): Self = this.set("childXmlNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildXmlNames: Self = this.set("childXmlNames", js.undefined)
    
    @scala.inline
    def setDirectoryName(value: String): Self = this.set("directoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryName: Self = this.set("directoryName", js.undefined)
    
    @scala.inline
    def setInFolder(value: Boolean): Self = this.set("inFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInFolder: Self = this.set("inFolder", js.undefined)
    
    @scala.inline
    def setMetaFile(value: Boolean): Self = this.set("metaFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaFile: Self = this.set("metaFile", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
}
