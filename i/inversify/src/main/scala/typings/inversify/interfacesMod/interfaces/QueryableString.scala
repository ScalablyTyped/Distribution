package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryableString extends StObject {
  
  def contains(searchString: String): Boolean
  
  def endsWith(searchString: String): Boolean
  
  def equals(compareString: String): Boolean
  
  def startsWith(searchString: String): Boolean
  
  def value(): String
}
object QueryableString {
  
  @scala.inline
  def apply(
    contains: String => Boolean,
    endsWith: String => Boolean,
    equals_ : String => Boolean,
    startsWith: String => Boolean,
    value: () => String
  ): QueryableString = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), endsWith = js.Any.fromFunction1(endsWith), startsWith = js.Any.fromFunction1(startsWith), value = js.Any.fromFunction0(value))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[QueryableString]
  }
  
  @scala.inline
  implicit class QueryableStringMutableBuilder[Self <: QueryableString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: String => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndsWith(value: String => Boolean): Self = StObject.set(x, "endsWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals_(value: String => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartsWith(value: String => Boolean): Self = StObject.set(x, "startsWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: () => String): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
