package typings.ionic

import typings.ionic.definitionsMod.IAilment
import typings.ionic.ionicStrings.`viewport-fit-not-set`
import typings.ionic.libDoctorAilmentsBaseMod.AilmentDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDoctorAilmentsMod {
  
  @JSImport("ionic/lib/doctor/ailments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("ionic/lib/doctor/ailments", "Ailment")
  @js.native
  open class Ailment protected ()
    extends typings.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(param0: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "AilmentRegistry")
  @js.native
  open class AilmentRegistry ()
    extends typings.ionic.libDoctorAilmentsBaseMod.AilmentRegistry
  
  @JSImport("ionic/lib/doctor/ailments", "CordovaPlatformsCommitted")
  @js.native
  open class CordovaPlatformsCommitted protected ()
    extends typings.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(param0: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "DefaultCordovaBundleIdUsed")
  @js.native
  open class DefaultCordovaBundleIdUsed protected ()
    extends typings.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(param0: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "GitConfigInvalid")
  @js.native
  open class GitConfigInvalid protected ()
    extends typings.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(param0: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "GitNotUsed")
  @js.native
  open class GitNotUsed protected ()
    extends typings.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(param0: AilmentDeps) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ionic.definitionsMod.IAilment because Already inherited
  - typings.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @JSImport("ionic/lib/doctor/ailments", "IonicCLIInstalledLocally")
  @js.native
  open class IonicCLIInstalledLocally protected ()
    extends typings.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(param0: AilmentDeps) = this()
    
    val treatable: /* true */ Boolean = js.native
  }
  
  @JSImport("ionic/lib/doctor/ailments", "IonicNativeOldVersionInstalled")
  @js.native
  open class IonicNativeOldVersionInstalled protected ()
    extends typings.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(param0: AilmentDeps) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ionic.definitionsMod.IAilment because Already inherited
  - typings.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @JSImport("ionic/lib/doctor/ailments", "NpmInstalledLocally")
  @js.native
  open class NpmInstalledLocally protected ()
    extends typings.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(param0: AilmentDeps) = this()
    
    val treatable: /* true */ Boolean = js.native
  }
  
  @JSImport("ionic/lib/doctor/ailments", "UnsavedCordovaPlatforms")
  @js.native
  open class UnsavedCordovaPlatforms protected ()
    extends typings.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(param0: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "ViewportFitNotSet")
  @js.native
  open class ViewportFitNotSet protected ()
    extends typings.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(param0: AilmentDeps) = this()
    
    @JSName("id")
    val id_ViewportFitNotSet: `viewport-fit-not-set` = js.native
  }
  
  inline def formatAilmentMessage(ailment: IAilment): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatAilmentMessage")(ailment.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
