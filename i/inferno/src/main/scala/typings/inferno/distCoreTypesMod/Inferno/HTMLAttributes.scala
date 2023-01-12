package typings.inferno.distCoreTypesMod.Inferno

import typings.csstype.mod.PropertiesHyphen
import typings.inferno.distCoreTypesMod.Booleanish
import typings.inferno.infernoInts.`0`
import typings.inferno.infernoStrings.decimal
import typings.inferno.infernoStrings.email
import typings.inferno.infernoStrings.inherit
import typings.inferno.infernoStrings.no
import typings.inferno.infernoStrings.none
import typings.inferno.infernoStrings.numeric
import typings.inferno.infernoStrings.off
import typings.inferno.infernoStrings.on
import typings.inferno.infernoStrings.search
import typings.inferno.infernoStrings.tel
import typings.inferno.infernoStrings.text
import typings.inferno.infernoStrings.url
import typings.inferno.infernoStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLAttributes[T]
  extends StObject
     with AriaAttributes
     with DOMAttributes[T] {
  
  var about: js.UndefOr[String | Null] = js.undefined
  
  var accessKey: js.UndefOr[String | Null] = js.undefined
  
  var autoCapitalize: js.UndefOr[String | Null] = js.undefined
  
  var autoCorrect: js.UndefOr[String | Null] = js.undefined
  
  var autoSave: js.UndefOr[String | Null] = js.undefined
  
  var `class`: js.UndefOr[String | Null] = js.undefined
  
  var className: js.UndefOr[String | Null] = js.undefined
  
  var color: js.UndefOr[String | Null] = js.undefined
  
  var contentEditable: js.UndefOr[Booleanish | inherit | Null] = js.undefined
  
  var contextMenu: js.UndefOr[String | Null] = js.undefined
  
  var datatype: js.UndefOr[String | Null] = js.undefined
  
  var defaultChecked: js.UndefOr[Boolean | Null] = js.undefined
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String] | Null] = js.undefined
  
  var dir: js.UndefOr[String | Null] = js.undefined
  
  var draggable: js.UndefOr[Booleanish | Null] = js.undefined
  
  var hidden: js.UndefOr[Boolean | Null] = js.undefined
  
  var id: js.UndefOr[String | Null] = js.undefined
  
  var inlist: js.UndefOr[Any] = js.undefined
  
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null] = js.undefined
  
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String | Null] = js.undefined
  
  var itemID: js.UndefOr[String | Null] = js.undefined
  
  var itemProp: js.UndefOr[String | Null] = js.undefined
  
  var itemRef: js.UndefOr[String | Null] = js.undefined
  
  var itemScope: js.UndefOr[Boolean | Null] = js.undefined
  
  var itemType: js.UndefOr[String | Null] = js.undefined
  
  var lang: js.UndefOr[String | Null] = js.undefined
  
  var placeholder: js.UndefOr[String | Null] = js.undefined
  
  var prefix: js.UndefOr[String | Null] = js.undefined
  
  var property: js.UndefOr[String | Null] = js.undefined
  
  var radioGroup: js.UndefOr[String | Null] = js.undefined
  
  var resource: js.UndefOr[String | Null] = js.undefined
  
  var results: js.UndefOr[Double | Null] = js.undefined
  
  var role: js.UndefOr[AriaRole | Null] = js.undefined
  
  var security: js.UndefOr[String | Null] = js.undefined
  
  var slot: js.UndefOr[String | Null] = js.undefined
  
  var spellCheck: js.UndefOr[Booleanish | Null] = js.undefined
  
  var style: js.UndefOr[(PropertiesHyphen[String | `0`, String]) | String | Null] = js.undefined
  
  var tabIndex: js.UndefOr[Double | Null] = js.undefined
  
  var title: js.UndefOr[String | Null] = js.undefined
  
  var translate: js.UndefOr[yes | no | Null] = js.undefined
  
  var typeof: js.UndefOr[String | Null] = js.undefined
  
  var unselectable: js.UndefOr[on | off | Null] = js.undefined
  
  var vocab: js.UndefOr[String | Null] = js.undefined
}
object HTMLAttributes {
  
  inline def apply[T](): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLAttributes[?], T] (val x: Self & HTMLAttributes[T]) extends AnyVal {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutNull: Self = StObject.set(x, "about", null)
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyNull: Self = StObject.set(x, "accessKey", null)
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeNull: Self = StObject.set(x, "autoCapitalize", null)
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectNull: Self = StObject.set(x, "autoCorrect", null)
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    inline def setAutoSaveNull: Self = StObject.set(x, "autoSave", null)
    
    inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClassNull: Self = StObject.set(x, "class", null)
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    inline def setContentEditableNull: Self = StObject.set(x, "contentEditable", null)
    
    inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuNull: Self = StObject.set(x, "contextMenu", null)
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeNull: Self = StObject.set(x, "datatype", null)
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    inline def setDefaultCheckedNull: Self = StObject.set(x, "defaultChecked", null)
    
    inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirNull: Self = StObject.set(x, "dir", null)
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableNull: Self = StObject.set(x, "draggable", null)
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenNull: Self = StObject.set(x, "hidden", null)
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    inline def setInputModeNull: Self = StObject.set(x, "inputMode", null)
    
    inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsNull: Self = StObject.set(x, "is", null)
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
    
    inline def setItemIDNull: Self = StObject.set(x, "itemID", null)
    
    inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
    
    inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
    
    inline def setItemPropNull: Self = StObject.set(x, "itemProp", null)
    
    inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
    
    inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
    
    inline def setItemRefNull: Self = StObject.set(x, "itemRef", null)
    
    inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
    
    inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
    
    inline def setItemScopeNull: Self = StObject.set(x, "itemScope", null)
    
    inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
    
    inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeNull: Self = StObject.set(x, "itemType", null)
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangNull: Self = StObject.set(x, "lang", null)
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyNull: Self = StObject.set(x, "property", null)
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupNull: Self = StObject.set(x, "radioGroup", null)
    
    inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsNull: Self = StObject.set(x, "results", null)
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityNull: Self = StObject.set(x, "security", null)
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotNull: Self = StObject.set(x, "slot", null)
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    inline def setSpellCheckNull: Self = StObject.set(x, "spellCheck", null)
    
    inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    inline def setStyle(value: (PropertiesHyphen[String | `0`, String]) | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexNull: Self = StObject.set(x, "tabIndex", null)
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateNull: Self = StObject.set(x, "translate", null)
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setTypeofNull: Self = StObject.set(x, "typeof", null)
    
    inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableNull: Self = StObject.set(x, "unselectable", null)
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    inline def setVocabNull: Self = StObject.set(x, "vocab", null)
    
    inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}
