package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPets extends StObject {
  
  /**
    * Cats allowed. Domesticated felines are permitted at the property and allowed to stay in the guest room of their owner. May or may not require a fee.
    */
  var catsAllowed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Cats allowed exception.
    */
  var catsAllowedException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dogs allowed. Domesticated canines are permitted at the property and allowed to stay in the guest room of their owner. May or may not require a fee.
    */
  var dogsAllowed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Dogs allowed exception.
    */
  var dogsAllowedException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pets allowed. Household animals are allowed at the property and in the specific guest room of their owner. May or may not include dogs, cats, reptiles and/or fish. May or may not require a fee. Service animals are not considered to be pets, so not governed by this policy.
    */
  var petsAllowed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Pets allowed exception.
    */
  var petsAllowedException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pets allowed free. Household animals are allowed at the property and in the specific guest room of their owner for free. May or may not include dogs, cats, reptiles, and/or fish.
    */
  var petsAllowedFree: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Pets allowed free exception.
    */
  var petsAllowedFreeException: js.UndefOr[String | Null] = js.undefined
}
object SchemaPets {
  
  inline def apply(): SchemaPets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPets]
  }
  
  extension [Self <: SchemaPets](x: Self) {
    
    inline def setCatsAllowed(value: Boolean): Self = StObject.set(x, "catsAllowed", value.asInstanceOf[js.Any])
    
    inline def setCatsAllowedException(value: String): Self = StObject.set(x, "catsAllowedException", value.asInstanceOf[js.Any])
    
    inline def setCatsAllowedExceptionNull: Self = StObject.set(x, "catsAllowedException", null)
    
    inline def setCatsAllowedExceptionUndefined: Self = StObject.set(x, "catsAllowedException", js.undefined)
    
    inline def setCatsAllowedNull: Self = StObject.set(x, "catsAllowed", null)
    
    inline def setCatsAllowedUndefined: Self = StObject.set(x, "catsAllowed", js.undefined)
    
    inline def setDogsAllowed(value: Boolean): Self = StObject.set(x, "dogsAllowed", value.asInstanceOf[js.Any])
    
    inline def setDogsAllowedException(value: String): Self = StObject.set(x, "dogsAllowedException", value.asInstanceOf[js.Any])
    
    inline def setDogsAllowedExceptionNull: Self = StObject.set(x, "dogsAllowedException", null)
    
    inline def setDogsAllowedExceptionUndefined: Self = StObject.set(x, "dogsAllowedException", js.undefined)
    
    inline def setDogsAllowedNull: Self = StObject.set(x, "dogsAllowed", null)
    
    inline def setDogsAllowedUndefined: Self = StObject.set(x, "dogsAllowed", js.undefined)
    
    inline def setPetsAllowed(value: Boolean): Self = StObject.set(x, "petsAllowed", value.asInstanceOf[js.Any])
    
    inline def setPetsAllowedException(value: String): Self = StObject.set(x, "petsAllowedException", value.asInstanceOf[js.Any])
    
    inline def setPetsAllowedExceptionNull: Self = StObject.set(x, "petsAllowedException", null)
    
    inline def setPetsAllowedExceptionUndefined: Self = StObject.set(x, "petsAllowedException", js.undefined)
    
    inline def setPetsAllowedFree(value: Boolean): Self = StObject.set(x, "petsAllowedFree", value.asInstanceOf[js.Any])
    
    inline def setPetsAllowedFreeException(value: String): Self = StObject.set(x, "petsAllowedFreeException", value.asInstanceOf[js.Any])
    
    inline def setPetsAllowedFreeExceptionNull: Self = StObject.set(x, "petsAllowedFreeException", null)
    
    inline def setPetsAllowedFreeExceptionUndefined: Self = StObject.set(x, "petsAllowedFreeException", js.undefined)
    
    inline def setPetsAllowedFreeNull: Self = StObject.set(x, "petsAllowedFree", null)
    
    inline def setPetsAllowedFreeUndefined: Self = StObject.set(x, "petsAllowedFree", js.undefined)
    
    inline def setPetsAllowedNull: Self = StObject.set(x, "petsAllowed", null)
    
    inline def setPetsAllowedUndefined: Self = StObject.set(x, "petsAllowed", js.undefined)
  }
}
