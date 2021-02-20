package typings.ionic

import typings.ionic.ailmentsBaseMod.AilmentDeps
import typings.ionic.definitionsMod.IAilment
import typings.ionic.ionicStrings.`viewport-fit-not-set`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ailmentsMod {
  
  @JSImport("ionic/lib/doctor/ailments", "Ailment")
  @js.native
  abstract class Ailment protected ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "AilmentRegistry")
  @js.native
  class AilmentRegistry ()
    extends typings.ionic.ailmentsBaseMod.AilmentRegistry
  
  @JSImport("ionic/lib/doctor/ailments", "CordovaPlatformsCommitted")
  @js.native
  class CordovaPlatformsCommitted protected ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "DefaultCordovaBundleIdUsed")
  @js.native
  class DefaultCordovaBundleIdUsed protected ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "GitConfigInvalid")
  @js.native
  class GitConfigInvalid protected ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "GitNotUsed")
  @js.native
  class GitNotUsed protected ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ionic.definitionsMod.IAilment because Already inherited
  - typings.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @JSImport("ionic/lib/doctor/ailments", "IonicCLIInstalledLocally")
  @js.native
  class IonicCLIInstalledLocally protected ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
    
    val treatable: /* true */ Boolean = js.native
  }
  
  @JSImport("ionic/lib/doctor/ailments", "IonicNativeOldVersionInstalled")
  @js.native
  class IonicNativeOldVersionInstalled protected ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ionic.definitionsMod.IAilment because Already inherited
  - typings.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @JSImport("ionic/lib/doctor/ailments", "NpmInstalledLocally")
  @js.native
  class NpmInstalledLocally protected ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
    
    val treatable: /* true */ Boolean = js.native
  }
  
  @JSImport("ionic/lib/doctor/ailments", "UnsavedCordovaPlatforms")
  @js.native
  class UnsavedCordovaPlatforms protected ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "ViewportFitNotSet")
  @js.native
  class ViewportFitNotSet protected ()
    extends typings.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
    
    @JSName("id")
    val id_ViewportFitNotSet: `viewport-fit-not-set` = js.native
  }
  
  @JSImport("ionic/lib/doctor/ailments", "formatAilmentMessage")
  @js.native
  def formatAilmentMessage(ailment: IAilment): js.Promise[String] = js.native
}
