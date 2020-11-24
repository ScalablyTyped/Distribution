package typings.ionic.libServeMod

import typings.ionic.definitionsMod.NpmClient
import typings.ionic.definitionsMod.ServeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PkgManagerServeCLI extends ServeCLI[ServeOptions] {
  
  @JSName("program")
  val program_PkgManagerServeCLI: NpmClient = js.native
  
  @JSName("script")
  val script_PkgManagerServeCLI: /* "ionic:serve" */ String = js.native
}
