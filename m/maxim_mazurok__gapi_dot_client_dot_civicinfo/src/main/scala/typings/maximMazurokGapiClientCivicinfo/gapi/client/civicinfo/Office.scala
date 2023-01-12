package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Office extends StObject {
  
  /** The OCD ID of the division with which this office is associated. */
  var divisionId: js.UndefOr[String] = js.undefined
  
  /**
    * The levels of government of which this office is part. There may be more than one in cases where a jurisdiction effectively acts at two different levels of government; for example,
    * the mayor of the District of Columbia acts at "locality" level, but also effectively at both "administrative-area-2" and "administrative-area-1".
    */
  var levels: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The human-readable name of the office. */
  var name: js.UndefOr[String] = js.undefined
  
  /** List of indices in the officials array of people who presently hold this office. */
  var officialIndices: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The roles which this office fulfills. Roles are not meant to be exhaustive, or to exactly specify the entire set of responsibilities of a given office, but are meant to be rough
    * categories that are useful for general selection from or sorting of a list of offices.
    */
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of sources for this office. If multiple sources are listed, the data has been aggregated from those sources. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}
object Office {
  
  inline def apply(): Office = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Office]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Office] (val x: Self) extends AnyVal {
    
    inline def setDivisionId(value: String): Self = StObject.set(x, "divisionId", value.asInstanceOf[js.Any])
    
    inline def setDivisionIdUndefined: Self = StObject.set(x, "divisionId", js.undefined)
    
    inline def setLevels(value: js.Array[String]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setLevelsVarargs(value: String*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOfficialIndices(value: js.Array[Double]): Self = StObject.set(x, "officialIndices", value.asInstanceOf[js.Any])
    
    inline def setOfficialIndicesUndefined: Self = StObject.set(x, "officialIndices", js.undefined)
    
    inline def setOfficialIndicesVarargs(value: Double*): Self = StObject.set(x, "officialIndices", js.Array(value*))
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
