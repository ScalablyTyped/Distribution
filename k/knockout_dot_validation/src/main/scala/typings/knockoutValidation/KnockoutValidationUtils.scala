package typings.knockoutValidation

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationUtils extends StObject {
  
  def contextFor(node: Element): KnockoutValidationConfiguration
  
  def getConfigOptions(element: Element): KnockoutValidationConfiguration
  
  def getDomData(node: Element): KnockoutValidationConfiguration
  
  def getValue(o: Any): Any
  
  def hasAttribute(node: Element, attr: String): Boolean
  
  def insertAfter(node: Element, newNode: Element): Unit
  
  def isArray(o: Any): Boolean
  
  def isEmptyVal(`val`: Any): Boolean
  
  def isObject(o: Any): Boolean
  
  def isValidatable(o: Any): Boolean
  
  def newId(): Double
  
  def setDomData(node: Element, data: KnockoutValidationConfiguration): Unit
  
  def values(o: Any): js.Array[Any]
}
object KnockoutValidationUtils {
  
  inline def apply(
    contextFor: Element => KnockoutValidationConfiguration,
    getConfigOptions: Element => KnockoutValidationConfiguration,
    getDomData: Element => KnockoutValidationConfiguration,
    getValue: Any => Any,
    hasAttribute: (Element, String) => Boolean,
    insertAfter: (Element, Element) => Unit,
    isArray: Any => Boolean,
    isEmptyVal: Any => Boolean,
    isObject: Any => Boolean,
    isValidatable: Any => Boolean,
    newId: () => Double,
    setDomData: (Element, KnockoutValidationConfiguration) => Unit,
    values: Any => js.Array[Any]
  ): KnockoutValidationUtils = {
    val __obj = js.Dynamic.literal(contextFor = js.Any.fromFunction1(contextFor), getConfigOptions = js.Any.fromFunction1(getConfigOptions), getDomData = js.Any.fromFunction1(getDomData), getValue = js.Any.fromFunction1(getValue), hasAttribute = js.Any.fromFunction2(hasAttribute), insertAfter = js.Any.fromFunction2(insertAfter), isArray = js.Any.fromFunction1(isArray), isEmptyVal = js.Any.fromFunction1(isEmptyVal), isObject = js.Any.fromFunction1(isObject), isValidatable = js.Any.fromFunction1(isValidatable), newId = js.Any.fromFunction0(newId), setDomData = js.Any.fromFunction2(setDomData), values = js.Any.fromFunction1(values))
    __obj.asInstanceOf[KnockoutValidationUtils]
  }
  
  extension [Self <: KnockoutValidationUtils](x: Self) {
    
    inline def setContextFor(value: Element => KnockoutValidationConfiguration): Self = StObject.set(x, "contextFor", js.Any.fromFunction1(value))
    
    inline def setGetConfigOptions(value: Element => KnockoutValidationConfiguration): Self = StObject.set(x, "getConfigOptions", js.Any.fromFunction1(value))
    
    inline def setGetDomData(value: Element => KnockoutValidationConfiguration): Self = StObject.set(x, "getDomData", js.Any.fromFunction1(value))
    
    inline def setGetValue(value: Any => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setHasAttribute(value: (Element, String) => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction2(value))
    
    inline def setInsertAfter(value: (Element, Element) => Unit): Self = StObject.set(x, "insertAfter", js.Any.fromFunction2(value))
    
    inline def setIsArray(value: Any => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction1(value))
    
    inline def setIsEmptyVal(value: Any => Boolean): Self = StObject.set(x, "isEmptyVal", js.Any.fromFunction1(value))
    
    inline def setIsObject(value: Any => Boolean): Self = StObject.set(x, "isObject", js.Any.fromFunction1(value))
    
    inline def setIsValidatable(value: Any => Boolean): Self = StObject.set(x, "isValidatable", js.Any.fromFunction1(value))
    
    inline def setNewId(value: () => Double): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
    
    inline def setSetDomData(value: (Element, KnockoutValidationConfiguration) => Unit): Self = StObject.set(x, "setDomData", js.Any.fromFunction2(value))
    
    inline def setValues(value: Any => js.Array[Any]): Self = StObject.set(x, "values", js.Any.fromFunction1(value))
  }
}
