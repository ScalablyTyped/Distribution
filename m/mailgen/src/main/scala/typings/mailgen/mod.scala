package typings.mailgen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Created by kiettv on 7/24/16.
    */
  @JSImport("mailgen", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Mailgen {
    def this(opts: Option) = this()
    
    /* CompleteClass */
    override def cacheThemes(): Unit = js.native
    
    /* CompleteClass */
    override def generate(params: Content): js.Any = js.native
    
    /* CompleteClass */
    override def generatePlaintext(params: Content): js.Any = js.native
    
    /* CompleteClass */
    override def parseParams(params: js.Any): js.Any = js.native
  }
  
  trait Action extends StObject {
    
    var button: Button
    
    var instructions: String
  }
  object Action {
    
    @scala.inline
    def apply(button: Button, instructions: String): Action = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: Button): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Button extends StObject {
    
    var color: String
    
    var link: String
    
    var text: String
  }
  object Button {
    
    @scala.inline
    def apply(color: String, link: String, text: String): Button = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Button]
    }
    
    @scala.inline
    implicit class ButtonMutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnOptions extends StObject {
    
    var customAlignment: js.Any
    
    var customWidth: js.Any
  }
  object ColumnOptions {
    
    @scala.inline
    def apply(customAlignment: js.Any, customWidth: js.Any): ColumnOptions = {
      val __obj = js.Dynamic.literal(customAlignment = customAlignment.asInstanceOf[js.Any], customWidth = customWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnOptions]
    }
    
    @scala.inline
    implicit class ColumnOptionsMutableBuilder[Self <: ColumnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomAlignment(value: js.Any): Self = StObject.set(x, "customAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomWidth(value: js.Any): Self = StObject.set(x, "customWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait Content extends StObject {
    
    var body: ContentBody
  }
  object Content {
    
    @scala.inline
    def apply(body: ContentBody): Content = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: ContentBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentBody extends StObject {
    
    var action: js.UndefOr[Action | js.Array[Action]] = js.undefined
    
    var dictionary: js.UndefOr[js.Any] = js.undefined
    
    var goToAction: js.UndefOr[GoToAction] = js.undefined
    
    var greeting: js.UndefOr[String] = js.undefined
    
    var intro: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var outro: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var signature: js.UndefOr[String] = js.undefined
    
    var table: js.UndefOr[Table | js.Array[Table]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ContentBody {
    
    @scala.inline
    def apply(): ContentBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentBody]
    }
    
    @scala.inline
    implicit class ContentBodyMutableBuilder[Self <: ContentBody] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: Action | js.Array[Action]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setActionVarargs(value: Action*): Self = StObject.set(x, "action", js.Array(value :_*))
      
      @scala.inline
      def setDictionary(value: js.Any): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
      
      @scala.inline
      def setGoToAction(value: GoToAction): Self = StObject.set(x, "goToAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoToActionUndefined: Self = StObject.set(x, "goToAction", js.undefined)
      
      @scala.inline
      def setGreeting(value: String): Self = StObject.set(x, "greeting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreetingUndefined: Self = StObject.set(x, "greeting", js.undefined)
      
      @scala.inline
      def setIntro(value: String | js.Array[String]): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
      
      @scala.inline
      def setIntroVarargs(value: String*): Self = StObject.set(x, "intro", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOutro(value: String | js.Array[String]): Self = StObject.set(x, "outro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutroUndefined: Self = StObject.set(x, "outro", js.undefined)
      
      @scala.inline
      def setOutroVarargs(value: String*): Self = StObject.set(x, "outro", js.Array(value :_*))
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      @scala.inline
      def setTable(value: Table | js.Array[Table]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setTableVarargs(value: Table*): Self = StObject.set(x, "table", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait CustomTheme extends StObject {
    
    var path: String
    
    var plaintextPath: js.UndefOr[String] = js.undefined
  }
  object CustomTheme {
    
    @scala.inline
    def apply(path: String): CustomTheme = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTheme]
    }
    
    @scala.inline
    implicit class CustomThemeMutableBuilder[Self <: CustomTheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintextPath(value: String): Self = StObject.set(x, "plaintextPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintextPathUndefined: Self = StObject.set(x, "plaintextPath", js.undefined)
    }
  }
  
  trait GoToAction extends StObject {
    
    var description: String
    
    var link: String
    
    var text: String
  }
  object GoToAction {
    
    @scala.inline
    def apply(description: String, link: String, text: String): GoToAction = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoToAction]
    }
    
    @scala.inline
    implicit class GoToActionMutableBuilder[Self <: GoToAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Created by kiettv on 7/24/16.
    */
  trait Mailgen extends StObject {
    
    def cacheThemes(): Unit
    
    def generate(params: Content): js.Any
    
    def generatePlaintext(params: Content): js.Any
    
    def parseParams(params: js.Any): js.Any
  }
  object Mailgen {
    
    @scala.inline
    def apply(
      cacheThemes: () => Unit,
      generate: Content => js.Any,
      generatePlaintext: Content => js.Any,
      parseParams: js.Any => js.Any
    ): Mailgen = {
      val __obj = js.Dynamic.literal(cacheThemes = js.Any.fromFunction0(cacheThemes), generate = js.Any.fromFunction1(generate), generatePlaintext = js.Any.fromFunction1(generatePlaintext), parseParams = js.Any.fromFunction1(parseParams))
      __obj.asInstanceOf[Mailgen]
    }
    
    @scala.inline
    implicit class MailgenMutableBuilder[Self <: Mailgen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheThemes(value: () => Unit): Self = StObject.set(x, "cacheThemes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGenerate(value: Content => js.Any): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGeneratePlaintext(value: Content => js.Any): Self = StObject.set(x, "generatePlaintext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseParams(value: js.Any => js.Any): Self = StObject.set(x, "parseParams", js.Any.fromFunction1(value))
    }
  }
  
  trait Option extends StObject {
    
    var product: Product
    
    var theme: String | CustomTheme
  }
  object Option {
    
    @scala.inline
    def apply(product: Product, theme: String | CustomTheme): Option = {
      val __obj = js.Dynamic.literal(product = product.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: String | CustomTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait Product extends StObject {
    
    var copyright: js.UndefOr[String] = js.undefined
    
    var link: String
    
    var logo: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object Product {
    
    @scala.inline
    def apply(link: String, name: String): Product = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Product]
    }
    
    @scala.inline
    implicit class ProductMutableBuilder[Self <: Product] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Table extends StObject {
    
    var columns: js.UndefOr[js.Array[ColumnOptions]] = js.undefined
    
    var data: js.Array[js.Any]
  }
  object Table {
    
    @scala.inline
    def apply(data: js.Array[js.Any]): Table = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Table]
    }
    
    @scala.inline
    implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[ColumnOptions]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: ColumnOptions*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    }
  }
}
