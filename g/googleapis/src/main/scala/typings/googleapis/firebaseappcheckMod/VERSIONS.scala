package typings.googleapis.firebaseappcheckMod

import org.scalablytyped.runtime.Instantiable2
import typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1.Firebaseappcheck
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VERSIONS {
  
  @JSImport("googleapis/build/src/apis/firebaseappcheck", "VERSIONS")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/firebaseappcheck", "VERSIONS.v1")
  @js.native
  open class v1 protected () extends Firebaseappcheck {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/firebaseappcheck", "VERSIONS.v1")
  @js.native
  def v1: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    Firebaseappcheck
  ] = js.native
  inline def v1_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      Firebaseappcheck
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("googleapis/build/src/apis/firebaseappcheck", "VERSIONS.v1beta")
  @js.native
  open class v1beta protected ()
    extends typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta.Firebaseappcheck {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  @JSImport("googleapis/build/src/apis/firebaseappcheck", "VERSIONS.v1beta")
  @js.native
  def v1beta: Instantiable2[
    /* options */ GlobalOptions, 
    /* google */ js.UndefOr[GoogleConfigurable], 
    typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta.Firebaseappcheck
  ] = js.native
  inline def v1beta_=(
    x: Instantiable2[
      /* options */ GlobalOptions, 
      /* google */ js.UndefOr[GoogleConfigurable], 
      typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta.Firebaseappcheck
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta")(x.asInstanceOf[js.Any])
}
