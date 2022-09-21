package typings.googleapis.jobsMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.jobsV2Mod.jobsV2.Jobs
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/jobs", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v2")
  @js.native
  open class v2 protected () extends Jobs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v2")
  @js.native
  def v2: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Jobs] = js.native
  inline def v2_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Jobs]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v3")
  @js.native
  open class v3 protected ()
    extends typings.googleapis.jobsV3Mod.jobsV3.Jobs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v3")
  @js.native
  def v3: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.jobsV3Mod.jobsV3.Jobs
  ] = js.native
  inline def v3_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.jobsV3Mod.jobsV3.Jobs
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v3p1beta1")
  @js.native
  open class v3p1beta1 protected ()
    extends typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v3p1beta1")
  @js.native
  def v3p1beta1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs
  ] = js.native
  inline def v3p1beta1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3p1beta1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v4")
  @js.native
  open class v4 protected ()
    extends typings.googleapis.jobsV4Mod.jobsV4.Jobs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v4")
  @js.native
  def v4: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.jobsV4Mod.jobsV4.Jobs
  ] = js.native
  inline def v4_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.jobsV4Mod.jobsV4.Jobs
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v4")(x.asInstanceOf[js.Any])
}
