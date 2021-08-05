package typings.jxon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jxon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(xMLParent: js.Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(xMLParent.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def build(xMLParent: js.Any, verbosity: Unit, freeze: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(xMLParent.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any], freeze.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def build(xMLParent: js.Any, verbosity: Unit, freeze: Boolean, nesteAttributes: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(xMLParent.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any], freeze.asInstanceOf[js.Any], nesteAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def build(xMLParent: js.Any, verbosity: Unit, freeze: Unit, nesteAttributes: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(xMLParent.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any], freeze.asInstanceOf[js.Any], nesteAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def build(xMLParent: js.Any, verbosity: VerbosityType): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(xMLParent.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def build(xMLParent: js.Any, verbosity: VerbosityType, freeze: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(xMLParent.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any], freeze.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def build(xMLParent: js.Any, verbosity: VerbosityType, freeze: Boolean, nesteAttributes: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(xMLParent.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any], freeze.asInstanceOf[js.Any], nesteAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def build(xMLParent: js.Any, verbosity: VerbosityType, freeze: Unit, nesteAttributes: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(xMLParent.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any], freeze.asInstanceOf[js.Any], nesteAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def config(cfg: ConfigOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(cfg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def each(obj: js.Any, func: FunctionType, thisArg: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], func.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def jsToString(objTree: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("jsToString")(objTree.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def jsToString(objTree: js.Object, namespaceURI: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToString")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def jsToString(objTree: js.Object, namespaceURI: String, qualifiedName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToString")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def jsToString(objTree: js.Object, namespaceURI: String, qualifiedName: String, documentType: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToString")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def jsToString(objTree: js.Object, namespaceURI: String, qualifiedName: Unit, documentType: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToString")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def jsToString(objTree: js.Object, namespaceURI: Unit, qualifiedName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToString")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def jsToString(objTree: js.Object, namespaceURI: Unit, qualifiedName: String, documentType: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToString")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def jsToString(objTree: js.Object, namespaceURI: Unit, qualifiedName: Unit, documentType: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToString")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def jsToXml(objTree: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("jsToXml")(objTree.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def jsToXml(objTree: js.Object, namespaceURI: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToXml")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def jsToXml(objTree: js.Object, namespaceURI: String, qualifiedName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToXml")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def jsToXml(objTree: js.Object, namespaceURI: String, qualifiedName: String, documentType: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToXml")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def jsToXml(objTree: js.Object, namespaceURI: String, qualifiedName: Unit, documentType: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToXml")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def jsToXml(objTree: js.Object, namespaceURI: Unit, qualifiedName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToXml")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def jsToXml(objTree: js.Object, namespaceURI: Unit, qualifiedName: String, documentType: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToXml")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def jsToXml(objTree: js.Object, namespaceURI: Unit, qualifiedName: Unit, documentType: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("jsToXml")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def stringToJs(str: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToJs")(str.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def stringToXml(xmlStr: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToXml")(xmlStr.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def stringify(objTree: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(objTree.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(objTree: js.Object, namespaceURI: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(objTree: js.Object, namespaceURI: String, qualifiedName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(objTree: js.Object, namespaceURI: String, qualifiedName: String, documentType: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(objTree: js.Object, namespaceURI: String, qualifiedName: Unit, documentType: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(objTree: js.Object, namespaceURI: Unit, qualifiedName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(objTree: js.Object, namespaceURI: Unit, qualifiedName: String, documentType: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(objTree: js.Object, namespaceURI: Unit, qualifiedName: Unit, documentType: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unbuild(objTree: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unbuild")(objTree.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def unbuild(objTree: js.Object, namespaceURI: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbuild")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unbuild(objTree: js.Object, namespaceURI: String, qualifiedName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbuild")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unbuild(objTree: js.Object, namespaceURI: String, qualifiedName: String, documentType: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbuild")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unbuild(objTree: js.Object, namespaceURI: String, qualifiedName: Unit, documentType: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbuild")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unbuild(objTree: js.Object, namespaceURI: Unit, qualifiedName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbuild")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unbuild(objTree: js.Object, namespaceURI: Unit, qualifiedName: String, documentType: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbuild")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unbuild(objTree: js.Object, namespaceURI: Unit, qualifiedName: Unit, documentType: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbuild")(objTree.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def xmlToJs(xmlDocument: js.Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlToJs")(xmlDocument.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def xmlToJs(xmlDocument: js.Any, verbosity: Unit, freeze: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlToJs")(xmlDocument.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any], freeze.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def xmlToJs(xmlDocument: js.Any, verbosity: Unit, freeze: Boolean, nestedAttributes: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlToJs")(xmlDocument.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any], freeze.asInstanceOf[js.Any], nestedAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def xmlToJs(xmlDocument: js.Any, verbosity: Unit, freeze: Unit, nestedAttributes: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlToJs")(xmlDocument.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any], freeze.asInstanceOf[js.Any], nestedAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def xmlToJs(xmlDocument: js.Any, verbosity: VerbosityType): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlToJs")(xmlDocument.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def xmlToJs(xmlDocument: js.Any, verbosity: VerbosityType, freeze: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlToJs")(xmlDocument.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any], freeze.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def xmlToJs(xmlDocument: js.Any, verbosity: VerbosityType, freeze: Boolean, nestedAttributes: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlToJs")(xmlDocument.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any], freeze.asInstanceOf[js.Any], nestedAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def xmlToJs(xmlDocument: js.Any, verbosity: VerbosityType, freeze: Unit, nestedAttributes: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlToJs")(xmlDocument.asInstanceOf[js.Any], verbosity.asInstanceOf[js.Any], freeze.asInstanceOf[js.Any], nestedAttributes.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def xmlToString(xmlObj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlToString")(xmlObj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ConfigOptions extends StObject {
    
    var attrKey: js.UndefOr[String] = js.undefined
    
    var attrPrefix: js.UndefOr[String] = js.undefined
    
    var autoDate: js.UndefOr[Boolean] = js.undefined
    
    var ignorePrefixedNodes: js.UndefOr[Boolean] = js.undefined
    
    var lowerCaseTags: js.UndefOr[Boolean] = js.undefined
    
    var parseValues: js.UndefOr[Boolean] = js.undefined
    
    var trueIsEmpty: js.UndefOr[Boolean] = js.undefined
    
    var valueKey: js.UndefOr[String] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setAttrKey(value: String): Self = StObject.set(x, "attrKey", value.asInstanceOf[js.Any])
      
      inline def setAttrKeyUndefined: Self = StObject.set(x, "attrKey", js.undefined)
      
      inline def setAttrPrefix(value: String): Self = StObject.set(x, "attrPrefix", value.asInstanceOf[js.Any])
      
      inline def setAttrPrefixUndefined: Self = StObject.set(x, "attrPrefix", js.undefined)
      
      inline def setAutoDate(value: Boolean): Self = StObject.set(x, "autoDate", value.asInstanceOf[js.Any])
      
      inline def setAutoDateUndefined: Self = StObject.set(x, "autoDate", js.undefined)
      
      inline def setIgnorePrefixedNodes(value: Boolean): Self = StObject.set(x, "ignorePrefixedNodes", value.asInstanceOf[js.Any])
      
      inline def setIgnorePrefixedNodesUndefined: Self = StObject.set(x, "ignorePrefixedNodes", js.undefined)
      
      inline def setLowerCaseTags(value: Boolean): Self = StObject.set(x, "lowerCaseTags", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseTagsUndefined: Self = StObject.set(x, "lowerCaseTags", js.undefined)
      
      inline def setParseValues(value: Boolean): Self = StObject.set(x, "parseValues", value.asInstanceOf[js.Any])
      
      inline def setParseValuesUndefined: Self = StObject.set(x, "parseValues", js.undefined)
      
      inline def setTrueIsEmpty(value: Boolean): Self = StObject.set(x, "trueIsEmpty", value.asInstanceOf[js.Any])
      
      inline def setTrueIsEmptyUndefined: Self = StObject.set(x, "trueIsEmpty", js.undefined)
      
      inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    }
  }
  
  type FunctionType = js.Function1[/* arg */ js.Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jxon.jxonNumbers.`0`
    - typings.jxon.jxonNumbers.`1`
    - typings.jxon.jxonNumbers.`2`
    - typings.jxon.jxonNumbers.`3`
  */
  trait VerbosityType extends StObject
  object VerbosityType {
    
    inline def `0`: typings.jxon.jxonNumbers.`0` = 0.asInstanceOf[typings.jxon.jxonNumbers.`0`]
    
    inline def `1`: typings.jxon.jxonNumbers.`1` = 1.asInstanceOf[typings.jxon.jxonNumbers.`1`]
    
    inline def `2`: typings.jxon.jxonNumbers.`2` = 2.asInstanceOf[typings.jxon.jxonNumbers.`2`]
    
    inline def `3`: typings.jxon.jxonNumbers.`3` = 3.asInstanceOf[typings.jxon.jxonNumbers.`3`]
  }
}
