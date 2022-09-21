package typings.manaSyringe

import typings.manaSyringe.contributionProtocolMod.Option
import typings.manaSyringe.contributionProtocolMod.Provider
import typings.manaSyringe.coreMod.Syringe.DefinedToken
import typings.manaSyringe.coreMod.Syringe.InjectOption
import typings.manaSyringe.coreMod.Syringe.Register
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contributionRegisterMod {
  
  @JSImport("mana-syringe/lib/contribution/contribution-register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contributionInjectOption(token: DefinedToken): InjectOption[Provider[DefinedToken]] = ^.asInstanceOf[js.Dynamic].applyDynamic("contributionInjectOption")(token.asInstanceOf[js.Any]).asInstanceOf[InjectOption[Provider[DefinedToken]]]
  inline def contributionInjectOption(token: DefinedToken, option: Option): InjectOption[Provider[DefinedToken]] = (^.asInstanceOf[js.Dynamic].applyDynamic("contributionInjectOption")(token.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[InjectOption[Provider[DefinedToken]]]
  
  inline def contributionRegister(registerMethod: Register, identifier: DefinedToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("contributionRegister")(registerMethod.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def contributionRegister(registerMethod: Register, identifier: DefinedToken, option: Option): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("contributionRegister")(registerMethod.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
