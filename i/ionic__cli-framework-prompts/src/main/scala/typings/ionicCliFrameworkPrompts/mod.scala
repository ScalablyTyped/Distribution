package typings.ionicCliFrameworkPrompts

import typings.inquirer.mod.Answers
import typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.checkbox
import typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.confirm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/cli-framework-prompts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPromptChoiceSeparator(): Separator = ^.asInstanceOf[js.Dynamic].applyDynamic("createPromptChoiceSeparator")().asInstanceOf[Separator]
  
  inline def createPromptModule(): js.Promise[PromptModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPromptModule")().asInstanceOf[js.Promise[PromptModule]]
  inline def createPromptModule(param0: CreatePromptModuleOptions): js.Promise[PromptModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPromptModule")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PromptModule]]
  
  trait CreatePromptModuleOptions extends StObject {
    
    val interactive: js.UndefOr[Boolean] = js.undefined
    
    val onFallback: js.UndefOr[js.Function1[/* question */ PromptQuestion, PromptValue | Unit]] = js.undefined
  }
  object CreatePromptModuleOptions {
    
    inline def apply(): CreatePromptModuleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatePromptModuleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreatePromptModuleOptions] (val x: Self) extends AnyVal {
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setOnFallback(value: /* question */ PromptQuestion => PromptValue | Unit): Self = StObject.set(x, "onFallback", js.Any.fromFunction1(value))
      
      inline def setOnFallbackUndefined: Self = StObject.set(x, "onFallback", js.undefined)
    }
  }
  
  type Inquirer = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_inquirer.Inquirer */ Any
  
  @js.native
  trait PromptModule extends StObject {
    
    def apply(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
    def apply(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
    def apply(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
    
    val _inquirer: Inquirer = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
    - typings.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
    - typings.ionicCliFrameworkPrompts.mod.PromptQuestionOther
  */
  trait PromptQuestion extends StObject
  object PromptQuestion {
    
    inline def PromptQuestionCheckbox(message: String, `type`: PromptTypeCheckbox): typings.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox]
    }
    
    inline def PromptQuestionConfirm(message: String, `type`: PromptTypeConfirm): typings.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm]
    }
    
    inline def PromptQuestionOther(message: String, `type`: PromptTypeOther): typings.ionicCliFrameworkPrompts.mod.PromptQuestionOther = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionicCliFrameworkPrompts.mod.PromptQuestionOther]
    }
  }
  
  trait PromptQuestionBase
    extends StObject
       with typings.inquirer.mod.Question[Answers] {
    
    /**
      * Default value to use if nothing is entered.
      */
    @JSName("default")
    var default_PromptQuestionBase: js.UndefOr[PromptValue] = js.undefined
    
    /**
      * The fallback value to use in non-TTY mode.
      */
    var fallback: js.UndefOr[PromptValue] = js.undefined
    
    /**
      * The question to print.
      */
    @JSName("message")
    var message_PromptQuestionBase: String
    
    /**
      * The prompt type for this question.
      *    - 'confirm': Y/n
      *    - 'checkbox': Multi-value selection.
      *    - 'input': Text input.
      *    - 'password': Masked text input.
      *    - 'list': Single-value selection.
      */
    @JSName("type")
    var type_PromptQuestionBase: PromptType
  }
  object PromptQuestionBase {
    
    inline def apply(message: String, `type`: PromptType): PromptQuestionBase = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptQuestionBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromptQuestionBase] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: PromptValue): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: String*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setFallback(value: PromptValue): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFallbackVarargs(value: String*): Self = StObject.set(x, "fallback", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: PromptType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromptQuestionCheckbox
    extends StObject
       with PromptQuestionBase
       with PromptQuestion {
    
    @JSName("default")
    var default_PromptQuestionCheckbox: js.UndefOr[PromptValueCheckbox] = js.undefined
    
    @JSName("fallback")
    var fallback_PromptQuestionCheckbox: js.UndefOr[PromptValueCheckbox] = js.undefined
    
    @JSName("type")
    var type_PromptQuestionCheckbox: PromptTypeCheckbox
  }
  object PromptQuestionCheckbox {
    
    inline def apply(message: String, `type`: PromptTypeCheckbox): PromptQuestionCheckbox = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptQuestionCheckbox]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromptQuestionCheckbox] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: PromptValueCheckbox): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: String*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setFallback(value: PromptValueCheckbox): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFallbackVarargs(value: String*): Self = StObject.set(x, "fallback", js.Array(value*))
      
      inline def setType(value: PromptTypeCheckbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromptQuestionConfirm
    extends StObject
       with PromptQuestionBase
       with PromptQuestion {
    
    @JSName("default")
    var default_PromptQuestionConfirm: js.UndefOr[PromptValueConfirm] = js.undefined
    
    @JSName("fallback")
    var fallback_PromptQuestionConfirm: js.UndefOr[PromptValueConfirm] = js.undefined
    
    @JSName("type")
    var type_PromptQuestionConfirm: PromptTypeConfirm
  }
  object PromptQuestionConfirm {
    
    inline def apply(message: String, `type`: PromptTypeConfirm): PromptQuestionConfirm = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptQuestionConfirm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromptQuestionConfirm] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: PromptValueConfirm): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setFallback(value: PromptValueConfirm): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setType(value: PromptTypeConfirm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromptQuestionOther
    extends StObject
       with PromptQuestionBase
       with PromptQuestion {
    
    @JSName("default")
    var default_PromptQuestionOther: js.UndefOr[PromptValueOther] = js.undefined
    
    @JSName("fallback")
    var fallback_PromptQuestionOther: js.UndefOr[PromptValueOther] = js.undefined
    
    @JSName("type")
    var type_PromptQuestionOther: PromptTypeOther
  }
  object PromptQuestionOther {
    
    inline def apply(message: String, `type`: PromptTypeOther): PromptQuestionOther = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptQuestionOther]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromptQuestionOther] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: PromptValueOther): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setFallback(value: PromptValueOther): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setType(value: PromptTypeOther): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type PromptType = PromptTypeConfirm | PromptTypeCheckbox | PromptTypeOther
  
  type PromptTypeCheckbox = checkbox
  
  type PromptTypeConfirm = confirm
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.input
    - typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.password
    - typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.list
  */
  trait PromptTypeOther extends StObject
  object PromptTypeOther {
    
    inline def input: typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.input = "input".asInstanceOf[typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.input]
    
    inline def list: typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.list = "list".asInstanceOf[typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.list]
    
    inline def password: typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.password = "password".asInstanceOf[typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.password]
  }
  
  type PromptValue = PromptValueConfirm | PromptValueCheckbox | PromptValueOther
  
  type PromptValueCheckbox = js.Array[String]
  
  type PromptValueConfirm = Boolean
  
  type PromptValueOther = String
  
  type Question = typings.inquirer.mod.Question[Answers]
  
  type Separator = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_inquirer.objects.Separator */ Any
}
