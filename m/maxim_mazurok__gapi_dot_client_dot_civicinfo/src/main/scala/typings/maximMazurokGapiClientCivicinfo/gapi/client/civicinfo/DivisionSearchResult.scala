package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DivisionSearchResult extends StObject {
  
  /**
    * Other Open Civic Data identifiers that refer to the same division -- for example, those that refer to other political divisions whose boundaries are defined to be coterminous with
    * this one. For example, ocd-division/country:us/state:wy will include an alias of ocd-division/country:us/state:wy/cd:1, since Wyoming has only one Congressional district.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name of the division. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The unique Open Civic Data identifier for this division */
  var ocdId: js.UndefOr[String] = js.undefined
}
object DivisionSearchResult {
  
  inline def apply(): DivisionSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivisionSearchResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DivisionSearchResult] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOcdId(value: String): Self = StObject.set(x, "ocdId", value.asInstanceOf[js.Any])
    
    inline def setOcdIdUndefined: Self = StObject.set(x, "ocdId", js.undefined)
  }
}
