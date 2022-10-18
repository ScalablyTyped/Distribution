package typings.manaSyringe

import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingWhenOnSyntax
import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.manaSyringe.libCoreMod.Syringe.FormattedInjectOption
import typings.manaSyringe.libCoreMod.Syringe.InjectOption
import typings.manaSyringe.libCoreMod.Syringe.Named
import typings.manaSyringe.libCoreMod.Syringe.TargetOption
import typings.manaSyringe.libCoreMod.Syringe.Token
import typings.manaSyringe.libCoreMod.Syringe.UnionToken
import typings.manaSyringe.libInversifyInversifyProtocolMod.InversifyRegister
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRegisterMod {
  
  @JSImport("mana-syringe/lib/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mana-syringe/lib/register", "Register")
  @js.native
  open class Register[T] protected () extends StObject {
    def this(register: InversifyRegister, token: UnionToken[T], option: FormattedInjectOption[T]) = this()
    
    /**
      * 兼容 inversify
      */
    /* protected */ var generalToken: ServiceIdentifier[T] = js.native
    
    /* protected */ var mutiple: Boolean = js.native
    
    /* protected */ var named: js.UndefOr[Named] = js.native
    
    /* protected */ var option: FormattedInjectOption[T] = js.native
    
    /* protected */ var rawToken: Token[T] = js.native
    
    /* protected */ var register: InversifyRegister = js.native
    
    /**
      * multi or mono register
      * mono bind 优先级 useValue > useDynamic > useFactory > useClass
      */
    def resolve(): Unit = js.native
    
    /* protected */ def resolveMono(register: InversifyRegister): js.UndefOr[BindingWhenOnSyntax[T]] = js.native
    
    /* protected */ def resolveMutilple(register: InversifyRegister): Unit = js.native
    
    /* protected */ var token: UnionToken[T] = js.native
  }
  /* static members */
  object Register {
    
    @JSImport("mana-syringe/lib/register", "Register")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mana-syringe/lib/register", "Register.globalConfig")
    @js.native
    def globalConfig: InjectOption[Any] = js.native
    inline def globalConfig_=(x: InjectOption[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalConfig")(x.asInstanceOf[js.Any])
    
    /**
      * 基于配置注册
      */
    inline def resolveOption[R](iRegister: InversifyRegister, baseOption: InjectOption[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOption")(iRegister.asInstanceOf[js.Any], baseOption.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * 注册目标 token，合并 token 配置后基于配置注册
      */
    inline def resolveTarget[R](register: InversifyRegister, target: Token[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTarget")(register.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def resolveTarget[R](register: InversifyRegister, target: Token[R], option: TargetOption[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTarget")(register.asInstanceOf[js.Any], target.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def toRegistryOption[P](options: InjectOption[P]): FormattedInjectOption[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("toRegistryOption")(options.asInstanceOf[js.Any]).asInstanceOf[FormattedInjectOption[P]]
}
