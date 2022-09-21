package typings.marko

import org.scalablytyped.runtime.StringDictionary
import typings.marko.anon.AttributeGroups
import typings.marko.anon.Name
import typings.marko.tagMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taglibLookupTaglibLookupMod {
  
  @JSImport("marko/src/compiler/taglib-lookup/TaglibLookup", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TaglibLookup
  
  trait Element extends StObject {
    
    var tagName: String
  }
  object Element {
    
    inline def apply(tagName: String): Element = {
      val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TaglibLookup extends StObject {
    
    def addTaglib(taglib: typings.marko.taglibMod.default): Unit = js.native
    
    def forEachAttribute(
      tagName: String,
      callback: js.Function2[/* attrDef */ typings.marko.attributeMod.default, /* tag */ ^, Unit]
    ): Unit = js.native
    
    def forEachNodeTransformer(node: Any, callback: js.Function1[/* trans */ typings.marko.transformerMod.default, Any]): Unit = js.native
    def forEachNodeTransformer(
      node: Any,
      callback: js.Function1[/* trans */ typings.marko.transformerMod.default, Any],
      thisObj: Any
    ): Unit = js.native
    
    def forEachTag(callback: js.Function1[/* tag */ ^, Unit | Boolean]): Unit = js.native
    
    def forEachTagTransformer(element: String, callback: js.Function1[/* trans */ typings.marko.transformerMod.default, Any]): Unit = js.native
    def forEachTagTransformer(
      element: String,
      callback: js.Function1[/* trans */ typings.marko.transformerMod.default, Any],
      thisObj: Any
    ): Unit = js.native
    def forEachTagTransformer(element: Element, callback: js.Function1[/* trans */ typings.marko.transformerMod.default, Any]): Unit = js.native
    def forEachTagTransformer(
      element: Element,
      callback: js.Function1[/* trans */ typings.marko.transformerMod.default, Any],
      thisObj: Any
    ): Unit = js.native
    
    def forEachTemplateTransformer(callback: js.Function1[/* trans */ typings.marko.transformerMod.default, Any]): Unit = js.native
    def forEachTemplateTransformer(callback: js.Function1[/* trans */ typings.marko.transformerMod.default, Any], thisObj: Any): Unit = js.native
    
    def forEachTextTransformer(callback: js.Function1[/* trans */ typings.marko.transformerMod.default, Any]): Unit = js.native
    def forEachTextTransformer(callback: js.Function1[/* trans */ typings.marko.transformerMod.default, Any], thisObj: Any): Unit = js.native
    
    def getAttribute(element: String, attr: String): js.UndefOr[typings.marko.attributeMod.default] = js.native
    def getAttribute(element: String, attr: Name): js.UndefOr[typings.marko.attributeMod.default] = js.native
    def getAttribute(element: Element, attr: String): js.UndefOr[typings.marko.attributeMod.default] = js.native
    def getAttribute(element: Element, attr: Name): js.UndefOr[typings.marko.attributeMod.default] = js.native
    
    def getInputFiles(): js.Array[String] = js.native
    
    def getTag(element: String): js.UndefOr[^] = js.native
    def getTag(element: Element): js.UndefOr[^] = js.native
    
    def getTagsSorted(): js.Array[^] = js.native
    
    def hasTaglib(taglib: typings.marko.taglibMod.default): Boolean = js.native
    
    var merged: AttributeGroups = js.native
    
    var taglibsById: StringDictionary[typings.marko.taglibMod.default] = js.native
  }
}
