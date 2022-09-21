package typings.manaSyringe

import typings.manaSyringe.contributionProtocolMod.Option
import typings.manaSyringe.coreMod.Syringe.Container
import typings.manaSyringe.coreMod.Syringe.Named
import typings.manaSyringe.coreMod.Syringe.Register
import typings.manaSyringe.coreMod.Syringe.Token
import typings.manaSyringe.mod.Syringe.DefinedToken
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contributionMod {
  
  @JSImport("mana-syringe/lib/contribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Contribution {
    
    @JSImport("mana-syringe/lib/contribution", "Contribution")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mana-syringe/lib/contribution", "Contribution.Provider")
    @js.native
    val Provider: DefinedToken = js.native
    type Provider[T /* <: Record[String, Any] */] = typings.manaSyringe.contributionProtocolMod.Provider[T]
    
    /* was `typeof contributionRegister` */
    inline def register(registerMethod: Register, identifier: typings.manaSyringe.coreMod.Syringe.DefinedToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(registerMethod.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(
      registerMethod: Register,
      identifier: typings.manaSyringe.coreMod.Syringe.DefinedToken,
      option: typings.manaSyringe.contributionProtocolMod.Option
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(registerMethod.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    type Option = typings.manaSyringe.contributionProtocolMod.Option
  }
  
  @JSImport("mana-syringe/lib/contribution", "DefaultContributionProvider")
  @js.native
  open class DefaultContributionProvider[T /* <: Record[String, Any] */] protected ()
    extends typings.manaSyringe.contributionProviderMod.DefaultContributionProvider[T] {
    def this(serviceIdentifier: Token[T], container: Container) = this()
    def this(serviceIdentifier: Token[T], container: Container, option: Option) = this()
  }
  
  @JSImport("mana-syringe/lib/contribution", "Provider")
  @js.native
  val Provider: typings.manaSyringe.coreMod.Syringe.DefinedToken = js.native
  
  inline def contrib(token: Named): js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("contrib")(token.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
}
