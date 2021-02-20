package typings.linguiMacro

import org.scalablytyped.runtime.StringDictionary
import typings.linguiMacro.renderMod.RenderProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactSelectMod {
  
  @JSImport("@lingui/macro/ReactSelect", "Plural")
  @js.native
  class Plural protected ()
    extends Component[PluralPropsWithoutI18n, js.Object, js.Any] {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/macro/ReactSelect", "Select")
  @js.native
  class Select protected ()
    extends Component[SelectPropsWithoutI18n, js.Object, js.Any] {
    def this(props: SelectPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SelectPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/macro/ReactSelect", "SelectOrdinal")
  @js.native
  class SelectOrdinal protected ()
    extends Component[PluralPropsWithoutI18n, js.Object, js.Any] {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @js.native
  trait PluralPropsWithoutI18n
    extends RenderProps
       with /* exact */ StringDictionary[ReactNode] {
    
    var few: js.UndefOr[ReactNode] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var many: js.UndefOr[ReactNode] = js.native
    
    var offset: js.UndefOr[Double | String] = js.native
    
    var one: js.UndefOr[ReactNode] = js.native
    
    var other: ReactNode = js.native
    
    var two: js.UndefOr[ReactNode] = js.native
    
    var value: Double | String = js.native
    
    var zero: js.UndefOr[ReactNode] = js.native
  }
  object PluralPropsWithoutI18n {
    
    @scala.inline
    def apply(value: Double | String): PluralPropsWithoutI18n = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralPropsWithoutI18n]
    }
    
    @scala.inline
    implicit class PluralPropsWithoutI18nMutableBuilder[Self <: PluralPropsWithoutI18n] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFew(value: ReactNode): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMany(value: ReactNode): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOne(value: ReactNode): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      @scala.inline
      def setOther(value: ReactNode): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      @scala.inline
      def setTwo(value: ReactNode): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZero(value: ReactNode): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  @js.native
  trait SelectPropsWithoutI18n
    extends RenderProps
       with /* exact */ StringDictionary[ReactNode] {
    
    var id: js.UndefOr[String] = js.native
    
    var other: ReactNode = js.native
    
    var value: String = js.native
  }
  object SelectPropsWithoutI18n {
    
    @scala.inline
    def apply(value: String): SelectPropsWithoutI18n = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectPropsWithoutI18n]
    }
    
    @scala.inline
    implicit class SelectPropsWithoutI18nMutableBuilder[Self <: SelectPropsWithoutI18n] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOther(value: ReactNode): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
