package typings.knockoutValidation

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationUtils extends js.Object {
  
  def contextFor(node: Element): KnockoutValidationConfiguration = js.native
  
  def getConfigOptions(element: Element): KnockoutValidationConfiguration = js.native
  
  def getDomData(node: Element): KnockoutValidationConfiguration = js.native
  
  def getValue(o: js.Any): js.Any = js.native
  
  def hasAttribute(node: Element, attr: String): Boolean = js.native
  
  def insertAfter(node: Element, newNode: Element): Unit = js.native
  
  def isArray(o: js.Any): Boolean = js.native
  
  def isEmptyVal(`val`: js.Any): Boolean = js.native
  
  def isObject(o: js.Any): Boolean = js.native
  
  def isValidatable(o: js.Any): Boolean = js.native
  
  def newId(): Double = js.native
  
  def setDomData(node: Element, data: KnockoutValidationConfiguration): Unit = js.native
  
  def values(o: js.Any): js.Array[_] = js.native
}
object KnockoutValidationUtils {
  
  @scala.inline
  def apply(
    contextFor: Element => KnockoutValidationConfiguration,
    getConfigOptions: Element => KnockoutValidationConfiguration,
    getDomData: Element => KnockoutValidationConfiguration,
    getValue: js.Any => js.Any,
    hasAttribute: (Element, String) => Boolean,
    insertAfter: (Element, Element) => Unit,
    isArray: js.Any => Boolean,
    isEmptyVal: js.Any => Boolean,
    isObject: js.Any => Boolean,
    isValidatable: js.Any => Boolean,
    newId: () => Double,
    setDomData: (Element, KnockoutValidationConfiguration) => Unit,
    values: js.Any => js.Array[_]
  ): KnockoutValidationUtils = {
    val __obj = js.Dynamic.literal(contextFor = js.Any.fromFunction1(contextFor), getConfigOptions = js.Any.fromFunction1(getConfigOptions), getDomData = js.Any.fromFunction1(getDomData), getValue = js.Any.fromFunction1(getValue), hasAttribute = js.Any.fromFunction2(hasAttribute), insertAfter = js.Any.fromFunction2(insertAfter), isArray = js.Any.fromFunction1(isArray), isEmptyVal = js.Any.fromFunction1(isEmptyVal), isObject = js.Any.fromFunction1(isObject), isValidatable = js.Any.fromFunction1(isValidatable), newId = js.Any.fromFunction0(newId), setDomData = js.Any.fromFunction2(setDomData), values = js.Any.fromFunction1(values))
    __obj.asInstanceOf[KnockoutValidationUtils]
  }
  
  @scala.inline
  implicit class KnockoutValidationUtilsOps[Self <: KnockoutValidationUtils] (val x: Self) extends AnyVal {
    
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
    def setContextFor(value: Element => KnockoutValidationConfiguration): Self = this.set("contextFor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetConfigOptions(value: Element => KnockoutValidationConfiguration): Self = this.set("getConfigOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDomData(value: Element => KnockoutValidationConfiguration): Self = this.set("getDomData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValue(value: js.Any => js.Any): Self = this.set("getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasAttribute(value: (Element, String) => Boolean): Self = this.set("hasAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertAfter(value: (Element, Element) => Unit): Self = this.set("insertAfter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsArray(value: js.Any => Boolean): Self = this.set("isArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmptyVal(value: js.Any => Boolean): Self = this.set("isEmptyVal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsObject(value: js.Any => Boolean): Self = this.set("isObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidatable(value: js.Any => Boolean): Self = this.set("isValidatable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewId(value: () => Double): Self = this.set("newId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDomData(value: (Element, KnockoutValidationConfiguration) => Unit): Self = this.set("setDomData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValues(value: js.Any => js.Array[_]): Self = this.set("values", js.Any.fromFunction1(value))
  }
}
