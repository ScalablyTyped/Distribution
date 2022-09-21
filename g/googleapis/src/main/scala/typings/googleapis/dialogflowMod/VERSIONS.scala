package typings.googleapis.dialogflowMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.dialogflowV2Mod.dialogflowV2.Dialogflow
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/dialogflow", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/dialogflow", "VERSIONS.v2")
  @js.native
  open class v2 protected () extends Dialogflow {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/dialogflow", "VERSIONS.v2")
  @js.native
  def v2: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Dialogflow] = js.native
  inline def v2_=(
    x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Dialogflow]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/dialogflow", "VERSIONS.v2beta1")
  @js.native
  open class v2beta1 protected ()
    extends typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1.Dialogflow {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/dialogflow", "VERSIONS.v2beta1")
  @js.native
  def v2beta1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1.Dialogflow
  ] = js.native
  inline def v2beta1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1.Dialogflow
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2beta1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/dialogflow", "VERSIONS.v3")
  @js.native
  open class v3 protected ()
    extends typings.googleapis.dialogflowV3Mod.dialogflowV3.Dialogflow {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/dialogflow", "VERSIONS.v3")
  @js.native
  def v3: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.dialogflowV3Mod.dialogflowV3.Dialogflow
  ] = js.native
  inline def v3_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.dialogflowV3Mod.dialogflowV3.Dialogflow
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/dialogflow", "VERSIONS.v3beta1")
  @js.native
  open class v3beta1 protected ()
    extends typings.googleapis.v3beta1Mod.dialogflowV3beta1.Dialogflow {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/dialogflow", "VERSIONS.v3beta1")
  @js.native
  def v3beta1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.v3beta1Mod.dialogflowV3beta1.Dialogflow
  ] = js.native
  inline def v3beta1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.v3beta1Mod.dialogflowV3beta1.Dialogflow
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3beta1")(x.asInstanceOf[js.Any])
}
