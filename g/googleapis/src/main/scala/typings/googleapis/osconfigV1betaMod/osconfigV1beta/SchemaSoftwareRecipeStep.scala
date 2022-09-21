package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSoftwareRecipeStep extends StObject {
  
  /**
    * Extracts an archive into the specified directory.
    */
  var archiveExtraction: js.UndefOr[SchemaSoftwareRecipeStepExtractArchive] = js.undefined
  
  /**
    * Installs a deb file via dpkg.
    */
  var dpkgInstallation: js.UndefOr[SchemaSoftwareRecipeStepInstallDpkg] = js.undefined
  
  /**
    * Copies a file onto the instance.
    */
  var fileCopy: js.UndefOr[SchemaSoftwareRecipeStepCopyFile] = js.undefined
  
  /**
    * Executes an artifact or local file.
    */
  var fileExec: js.UndefOr[SchemaSoftwareRecipeStepExecFile] = js.undefined
  
  /**
    * Installs an MSI file.
    */
  var msiInstallation: js.UndefOr[SchemaSoftwareRecipeStepInstallMsi] = js.undefined
  
  /**
    * Installs an rpm file via the rpm utility.
    */
  var rpmInstallation: js.UndefOr[SchemaSoftwareRecipeStepInstallRpm] = js.undefined
  
  /**
    * Runs commands in a shell.
    */
  var scriptRun: js.UndefOr[SchemaSoftwareRecipeStepRunScript] = js.undefined
}
object SchemaSoftwareRecipeStep {
  
  inline def apply(): SchemaSoftwareRecipeStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareRecipeStep]
  }
  
  extension [Self <: SchemaSoftwareRecipeStep](x: Self) {
    
    inline def setArchiveExtraction(value: SchemaSoftwareRecipeStepExtractArchive): Self = StObject.set(x, "archiveExtraction", value.asInstanceOf[js.Any])
    
    inline def setArchiveExtractionUndefined: Self = StObject.set(x, "archiveExtraction", js.undefined)
    
    inline def setDpkgInstallation(value: SchemaSoftwareRecipeStepInstallDpkg): Self = StObject.set(x, "dpkgInstallation", value.asInstanceOf[js.Any])
    
    inline def setDpkgInstallationUndefined: Self = StObject.set(x, "dpkgInstallation", js.undefined)
    
    inline def setFileCopy(value: SchemaSoftwareRecipeStepCopyFile): Self = StObject.set(x, "fileCopy", value.asInstanceOf[js.Any])
    
    inline def setFileCopyUndefined: Self = StObject.set(x, "fileCopy", js.undefined)
    
    inline def setFileExec(value: SchemaSoftwareRecipeStepExecFile): Self = StObject.set(x, "fileExec", value.asInstanceOf[js.Any])
    
    inline def setFileExecUndefined: Self = StObject.set(x, "fileExec", js.undefined)
    
    inline def setMsiInstallation(value: SchemaSoftwareRecipeStepInstallMsi): Self = StObject.set(x, "msiInstallation", value.asInstanceOf[js.Any])
    
    inline def setMsiInstallationUndefined: Self = StObject.set(x, "msiInstallation", js.undefined)
    
    inline def setRpmInstallation(value: SchemaSoftwareRecipeStepInstallRpm): Self = StObject.set(x, "rpmInstallation", value.asInstanceOf[js.Any])
    
    inline def setRpmInstallationUndefined: Self = StObject.set(x, "rpmInstallation", js.undefined)
    
    inline def setScriptRun(value: SchemaSoftwareRecipeStepRunScript): Self = StObject.set(x, "scriptRun", value.asInstanceOf[js.Any])
    
    inline def setScriptRunUndefined: Self = StObject.set(x, "scriptRun", js.undefined)
  }
}
