package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataObject extends StObject {
  
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
  implicit class MetadataObjectMutableBuilder[Self <: MetadataObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildXmlNames(value: js.Array[String]): Self = StObject.set(x, "childXmlNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildXmlNamesUndefined: Self = StObject.set(x, "childXmlNames", js.undefined)
    
    @scala.inline
    def setChildXmlNamesVarargs(value: String*): Self = StObject.set(x, "childXmlNames", js.Array(value :_*))
    
    @scala.inline
    def setDirectoryName(value: String): Self = StObject.set(x, "directoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryNameUndefined: Self = StObject.set(x, "directoryName", js.undefined)
    
    @scala.inline
    def setInFolder(value: Boolean): Self = StObject.set(x, "inFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInFolderUndefined: Self = StObject.set(x, "inFolder", js.undefined)
    
    @scala.inline
    def setMetaFile(value: Boolean): Self = StObject.set(x, "metaFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaFileUndefined: Self = StObject.set(x, "metaFile", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    @scala.inline
    def setXmlName(value: String): Self = StObject.set(x, "xmlName", value.asInstanceOf[js.Any])
  }
}
