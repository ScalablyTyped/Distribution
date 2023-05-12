package typings.linguiMacro

import org.scalablytyped.runtime.StringDictionary
import typings.linguiCore.mod.I18n_
import typings.linguiCore.mod.MessageDescriptor
import typings.linguiMacro.anon.FnCall
import typings.linguiReact.mod.TransRenderProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.VFC
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lingui/macro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lingui/macro", "Plural")
  @js.native
  val Plural_ : VFC[PluralChoiceProps] = js.native
  
  @JSImport("@lingui/macro", "SelectOrdinal")
  @js.native
  val SelectOrdinal_ : VFC[PluralChoiceProps] = js.native
  
  @JSImport("@lingui/macro", "Select")
  @js.native
  val Select_ : VFC[SelectChoiceProps] = js.native
  
  @JSImport("@lingui/macro", "Trans")
  @js.native
  val Trans: FC[TransProps] = js.native
  
  inline def defineMessage(descriptor: MacroMessageDescriptor): MessageDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessage")(descriptor.asInstanceOf[js.Any]).asInstanceOf[MessageDescriptor]
  inline def defineMessage(literals: TemplateStringsArray, placeholders: Any*): MessageDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessage")(scala.List(literals.asInstanceOf[js.Any]).`++`(placeholders.asInstanceOf[Seq[js.Any]])*).asInstanceOf[MessageDescriptor]
  
  inline def msg(descriptor: MacroMessageDescriptor): MessageDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("msg")(descriptor.asInstanceOf[js.Any]).asInstanceOf[MessageDescriptor]
  inline def msg(literals: TemplateStringsArray, placeholders: Any*): MessageDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("msg")(scala.List(literals.asInstanceOf[js.Any]).`++`(placeholders.asInstanceOf[Seq[js.Any]])*).asInstanceOf[MessageDescriptor]
  
  inline def plural(value: String, options: ChoiceOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def plural(value: Double, options: ChoiceOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def select(value: String, choices: SelectOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(value.asInstanceOf[js.Any], choices.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def selectOrdinal(value: String, options: ChoiceOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOrdinal")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def selectOrdinal(value: Double, options: ChoiceOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOrdinal")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def t(descriptor: MacroMessageDescriptor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(descriptor.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def t(i18n: I18n_): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(i18n.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  inline def t(literals: TemplateStringsArray, placeholders: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(scala.List(literals.asInstanceOf[js.Any]).`++`(placeholders.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  trait ChoiceOptions
    extends StObject
       with /* matches */ StringDictionary[String] {
    
    var few: js.UndefOr[String] = js.undefined
    
    var many: js.UndefOr[String] = js.undefined
    
    /** Offset of value when calculating plural forms */
    var offset: js.UndefOr[Double] = js.undefined
    
    var one: js.UndefOr[String] = js.undefined
    
    /** Catch-all option */
    var other: String
    
    var two: js.UndefOr[String] = js.undefined
    
    var zero: js.UndefOr[String] = js.undefined
  }
  object ChoiceOptions {
    
    inline def apply(other: String): ChoiceOptions = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChoiceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChoiceOptions] (val x: Self) extends AnyVal {
      
      inline def setFew(value: String): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      inline def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      inline def setMany(value: String): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOne(value: String): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setTwo(value: String): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      inline def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
      
      inline def setZero(value: String): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  trait CommonProps extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var i18n: js.UndefOr[I18n_] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* props */ TransRenderProps, ReactElement | Null]] = js.undefined
  }
  object CommonProps {
    
    inline def apply(): CommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setI18n(value: I18n_): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRender(value: /* props */ TransRenderProps => ReactElement | Null): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.linguiMacro.anon.idstringmessagestringunde
    - typings.linguiMacro.anon.idstringundefinedmessages
  */
  trait MacroMessageDescriptor extends StObject
  object MacroMessageDescriptor {
    
    inline def idstringmessagestringunde(id: String): typings.linguiMacro.anon.idstringmessagestringunde = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.linguiMacro.anon.idstringmessagestringunde]
    }
    
    inline def idstringundefinedmessages(message: String): typings.linguiMacro.anon.idstringundefinedmessages = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.linguiMacro.anon.idstringundefinedmessages]
    }
  }
  
  trait PluralChoiceProps
    extends StObject
       with CommonProps
       with /* option */ StringDictionary[ReactNode] {
    
    var few: js.UndefOr[ReactNode] = js.undefined
    
    var many: js.UndefOr[ReactNode] = js.undefined
    
    /** Offset of value when calculating plural forms */
    var offset: js.UndefOr[Double] = js.undefined
    
    var one: js.UndefOr[ReactNode] = js.undefined
    
    /** Catch-all option */
    var other: ReactNode
    
    var two: js.UndefOr[ReactNode] = js.undefined
    
    var value: String | Double
    
    var zero: js.UndefOr[ReactNode] = js.undefined
  }
  object PluralChoiceProps {
    
    inline def apply(value: String | Double): PluralChoiceProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralChoiceProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluralChoiceProps] (val x: Self) extends AnyVal {
      
      inline def setFew(value: ReactNode): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      inline def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      inline def setMany(value: ReactNode): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOne(value: ReactNode): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      inline def setOther(value: ReactNode): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setTwo(value: ReactNode): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      inline def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setZero(value: ReactNode): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  trait SelectChoiceProps
    extends StObject
       with CommonProps
       with /* option */ StringDictionary[ReactNode] {
    
    /** Catch-all option */
    var other: ReactNode
    
    var value: String
  }
  object SelectChoiceProps {
    
    inline def apply(value: String): SelectChoiceProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectChoiceProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectChoiceProps] (val x: Self) extends AnyVal {
      
      inline def setOther(value: ReactNode): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectOptions
    extends StObject
       with /* matches */ StringDictionary[String] {
    
    /** Catch-all option */
    var other: String
  }
  object SelectOptions {
    
    inline def apply(other: String): SelectOptions = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectOptions] (val x: Self) extends AnyVal {
      
      inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransProps
    extends StObject
       with CommonProps {
    
    var children: ReactNode
  }
  object TransProps {
    
    inline def apply(): TransProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
