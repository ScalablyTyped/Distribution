package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single menu command that is part of a Contact.
  */
trait SchemaCommand extends StObject {
  
  /**
    * The type of operation this command corresponds to. Allowed values are: -
    * TAKE_A_NOTE - Shares a timeline item with the transcription of user
    * speech from the &quot;Take a note&quot; voice menu command.   -
    * POST_AN_UPDATE - Shares a timeline item with the transcription of user
    * speech from the &quot;Post an update&quot; voice menu command.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaCommand {
  
  inline def apply(): SchemaCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommand]
  }
  
  extension [Self <: SchemaCommand](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
