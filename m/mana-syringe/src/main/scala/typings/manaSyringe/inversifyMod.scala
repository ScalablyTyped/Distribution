package typings.manaSyringe

import typings.inversify.interfacesMod.interfaces.BindingInSyntax
import typings.inversify.interfacesMod.interfaces.BindingToSyntax
import typings.inversify.interfacesMod.interfaces.BindingWhenOnSyntax
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversify.mod.Container
import typings.manaSyringe.coreMod.Syringe.FormattedInjectOption
import typings.manaSyringe.coreMod.Syringe.Named
import typings.manaSyringe.coreMod.Syringe.Token
import typings.manaSyringe.inversifyProtocolMod.InversifyRegister
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inversifyMod {
  
  @JSImport("mana-syringe/lib/inversify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mana-syringe/lib/inversify", "GlobalContainer")
  @js.native
  val GlobalContainer: Container = js.native
  
  inline def bindGeneralToken[T](token: ServiceIdentifier[T], register: InversifyRegister): BindingToSyntax[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindGeneralToken")(token.asInstanceOf[js.Any], register.asInstanceOf[js.Any])).asInstanceOf[BindingToSyntax[T]]
  
  inline def bindLifecycle[T](toBind: BindingInSyntax[T], option: FormattedInjectOption[T]): BindingWhenOnSyntax[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindLifecycle")(toBind.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[BindingWhenOnSyntax[T]]
  
  inline def bindMonoToken[T](token: ServiceIdentifier[T], register: InversifyRegister): BindingToSyntax[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindMonoToken")(token.asInstanceOf[js.Any], register.asInstanceOf[js.Any])).asInstanceOf[BindingToSyntax[T]]
  
  inline def bindNamed[T](toBind: BindingWhenOnSyntax[T], named: Named): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNamed")(toBind.asInstanceOf[js.Any], named.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bindSingleton[T](toBind: BindingInSyntax[T]): BindingWhenOnSyntax[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindSingleton")(toBind.asInstanceOf[js.Any]).asInstanceOf[BindingWhenOnSyntax[T]]
  
  inline def bindTransient[T](toBind: BindingInSyntax[T]): BindingWhenOnSyntax[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTransient")(toBind.asInstanceOf[js.Any]).asInstanceOf[BindingWhenOnSyntax[T]]
  
  inline def isInversifyContext(data: Record[Any, Any]): /* is mana-syringe.mana-syringe/lib/inversify/inversify-protocol.InversifyContext */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInversifyContext")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/inversify/inversify-protocol.InversifyContext */ Boolean]
  
  inline def isInversifyRegister(data: Record[Any, Any]): /* is mana-syringe.mana-syringe/lib/inversify/inversify-protocol.InversifyRegister */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInversifyRegister")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/inversify/inversify-protocol.InversifyRegister */ Boolean]
  
  inline def namedToIdentifier(named: Named): String | js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("namedToIdentifier")(named.asInstanceOf[js.Any]).asInstanceOf[String | js.Symbol]
  
  inline def tokenToIdentifier[T](token: Token[T]): ServiceIdentifier[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenToIdentifier")(token.asInstanceOf[js.Any]).asInstanceOf[ServiceIdentifier[T]]
}
