package typings.jsforce.apiMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataObject extends StObject {
  
  var childXmlNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var directoryName: js.UndefOr[String] = js.undefined
  
  var inFolder: js.UndefOr[Boolean] = js.undefined
  
  var metaFile: js.UndefOr[Boolean] = js.undefined
  
  var suffix: js.UndefOr[String] = js.undefined
  
  var xmlName: String
}
object MetadataObject {
  
  inline def apply(xmlName: String): MetadataObject = {
    val __obj = js.Dynamic.literal(xmlName = xmlName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataObject]
  }
  
  extension [Self <: MetadataObject](x: Self) {
    
    inline def setChildXmlNames(value: js.Array[String]): Self = StObject.set(x, "childXmlNames", value.asInstanceOf[js.Any])
    
    inline def setChildXmlNamesUndefined: Self = StObject.set(x, "childXmlNames", js.undefined)
    
    inline def setChildXmlNamesVarargs(value: String*): Self = StObject.set(x, "childXmlNames", js.Array(value*))
    
    inline def setDirectoryName(value: String): Self = StObject.set(x, "directoryName", value.asInstanceOf[js.Any])
    
    inline def setDirectoryNameUndefined: Self = StObject.set(x, "directoryName", js.undefined)
    
    inline def setInFolder(value: Boolean): Self = StObject.set(x, "inFolder", value.asInstanceOf[js.Any])
    
    inline def setInFolderUndefined: Self = StObject.set(x, "inFolder", js.undefined)
    
    inline def setMetaFile(value: Boolean): Self = StObject.set(x, "metaFile", value.asInstanceOf[js.Any])
    
    inline def setMetaFileUndefined: Self = StObject.set(x, "metaFile", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setXmlName(value: String): Self = StObject.set(x, "xmlName", value.asInstanceOf[js.Any])
  }
}
