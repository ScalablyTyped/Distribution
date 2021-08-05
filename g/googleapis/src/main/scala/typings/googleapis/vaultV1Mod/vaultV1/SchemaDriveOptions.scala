package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Drive search advanced options
  */
trait SchemaDriveOptions extends StObject {
  
  /**
    * Set to true to include Team Drive.
    */
  var includeTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Search the versions of the Drive file as of the reference date. These
    * timestamps are in GMT and rounded down to the given date.
    */
  var versionDate: js.UndefOr[String] = js.undefined
}
object SchemaDriveOptions {
  
  inline def apply(): SchemaDriveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveOptions]
  }
  
  extension [Self <: SchemaDriveOptions](x: Self) {
    
    inline def setIncludeTeamDrives(value: Boolean): Self = StObject.set(x, "includeTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setIncludeTeamDrivesUndefined: Self = StObject.set(x, "includeTeamDrives", js.undefined)
    
    inline def setVersionDate(value: String): Self = StObject.set(x, "versionDate", value.asInstanceOf[js.Any])
    
    inline def setVersionDateUndefined: Self = StObject.set(x, "versionDate", js.undefined)
  }
}
