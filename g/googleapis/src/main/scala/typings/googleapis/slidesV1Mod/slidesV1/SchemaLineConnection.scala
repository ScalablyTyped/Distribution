package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties for one end of a Line connection.
  */
trait SchemaLineConnection extends StObject {
  
  /**
    * The object ID of the connected page element.  Some page elements, such as
    * groups, tables, and lines do not have connection sites and therefore
    * cannot be connected to a connector line.
    */
  var connectedObjectId: js.UndefOr[String] = js.undefined
  
  /**
    * The index of the connection site on the connected page element.  In most
    * cases, it corresponds to the predefined connection site index from the
    * ECMA-376 standard. More information on those connection sites can be
    * found in the description of the &quot;cnx&quot; attribute in
    * section 20.1.9.9 and Annex H. &quot;Predefined DrawingML Shape and Text
    * Geometries&quot; of &quot;Office Open XML File Formats-Fundamentals and
    * Markup Language Reference&quot;, part 1 of [ECMA-376 5th edition]
    * (http://www.ecma-international.org/publications/standards/Ecma-376.htm).
    * The position of each connection site can also be viewed from Slides
    * editor.
    */
  var connectionSiteIndex: js.UndefOr[Double] = js.undefined
}
object SchemaLineConnection {
  
  inline def apply(): SchemaLineConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLineConnection]
  }
  
  extension [Self <: SchemaLineConnection](x: Self) {
    
    inline def setConnectedObjectId(value: String): Self = StObject.set(x, "connectedObjectId", value.asInstanceOf[js.Any])
    
    inline def setConnectedObjectIdUndefined: Self = StObject.set(x, "connectedObjectId", js.undefined)
    
    inline def setConnectionSiteIndex(value: Double): Self = StObject.set(x, "connectionSiteIndex", value.asInstanceOf[js.Any])
    
    inline def setConnectionSiteIndexUndefined: Self = StObject.set(x, "connectionSiteIndex", js.undefined)
  }
}
