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
  open class ^ protected ()
    extends StObject
       with Mailgen {
    def this(opts: Option) = this()
    
    /* CompleteClass */
    override def cacheThemes(): Unit = js.native
    
    /* CompleteClass */
    override def generate(params: Content): Any = js.native
    
    /* CompleteClass */
    override def generatePlaintext(params: Content): Any = js.native
    
    /* CompleteClass */
    override def parseParams(params: Any): Any = js.native
  }
  
  trait Action extends StObject {
    
    var button: Button
    
    var instructions: String
  }
  object Action {
    
    inline def apply(button: Button, instructions: String): Action = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setButton(value: Button): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Button extends StObject {
    
    var color: String
    
    var link: String
    
    var text: String
  }
  object Button {
    
    inline def apply(color: String, link: String, text: String): Button = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Button]
    }
    
    extension [Self <: Button](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnOptions extends StObject {
    
    var customAlignment: Any
    
    var customWidth: Any
  }
  object ColumnOptions {
    
    inline def apply(customAlignment: Any, customWidth: Any): ColumnOptions = {
      val __obj = js.Dynamic.literal(customAlignment = customAlignment.asInstanceOf[js.Any], customWidth = customWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnOptions]
    }
    
    extension [Self <: ColumnOptions](x: Self) {
      
      inline def setCustomAlignment(value: Any): Self = StObject.set(x, "customAlignment", value.asInstanceOf[js.Any])
      
      inline def setCustomWidth(value: Any): Self = StObject.set(x, "customWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait Content extends StObject {
    
    var body: ContentBody
  }
  object Content {
    
    inline def apply(body: ContentBody): Content = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setBody(value: ContentBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentBody extends StObject {
    
    var action: js.UndefOr[Action | js.Array[Action]] = js.undefined
    
    var dictionary: js.UndefOr[Any] = js.undefined
    
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
    
    inline def apply(): ContentBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentBody]
    }
    
    extension [Self <: ContentBody](x: Self) {
      
      inline def setAction(value: Action | js.Array[Action]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActionVarargs(value: Action*): Self = StObject.set(x, "action", js.Array(value*))
      
      inline def setDictionary(value: Any): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      inline def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
      
      inline def setGoToAction(value: GoToAction): Self = StObject.set(x, "goToAction", value.asInstanceOf[js.Any])
      
      inline def setGoToActionUndefined: Self = StObject.set(x, "goToAction", js.undefined)
      
      inline def setGreeting(value: String): Self = StObject.set(x, "greeting", value.asInstanceOf[js.Any])
      
      inline def setGreetingUndefined: Self = StObject.set(x, "greeting", js.undefined)
      
      inline def setIntro(value: String | js.Array[String]): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      inline def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
      
      inline def setIntroVarargs(value: String*): Self = StObject.set(x, "intro", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutro(value: String | js.Array[String]): Self = StObject.set(x, "outro", value.asInstanceOf[js.Any])
      
      inline def setOutroUndefined: Self = StObject.set(x, "outro", js.undefined)
      
      inline def setOutroVarargs(value: String*): Self = StObject.set(x, "outro", js.Array(value*))
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setTable(value: Table | js.Array[Table]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setTableVarargs(value: Table*): Self = StObject.set(x, "table", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait CustomTheme extends StObject {
    
    var path: String
    
    var plaintextPath: js.UndefOr[String] = js.undefined
  }
  object CustomTheme {
    
    inline def apply(path: String): CustomTheme = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTheme]
    }
    
    extension [Self <: CustomTheme](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPlaintextPath(value: String): Self = StObject.set(x, "plaintextPath", value.asInstanceOf[js.Any])
      
      inline def setPlaintextPathUndefined: Self = StObject.set(x, "plaintextPath", js.undefined)
    }
  }
  
  trait GoToAction extends StObject {
    
    var description: String
    
    var link: String
    
    var text: String
  }
  object GoToAction {
    
    inline def apply(description: String, link: String, text: String): GoToAction = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoToAction]
    }
    
    extension [Self <: GoToAction](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Created by kiettv on 7/24/16.
    */
  trait Mailgen extends StObject {
    
    def cacheThemes(): Unit
    
    def generate(params: Content): Any
    
    def generatePlaintext(params: Content): Any
    
    def parseParams(params: Any): Any
  }
  object Mailgen {
    
    inline def apply(
      cacheThemes: () => Unit,
      generate: Content => Any,
      generatePlaintext: Content => Any,
      parseParams: Any => Any
    ): Mailgen = {
      val __obj = js.Dynamic.literal(cacheThemes = js.Any.fromFunction0(cacheThemes), generate = js.Any.fromFunction1(generate), generatePlaintext = js.Any.fromFunction1(generatePlaintext), parseParams = js.Any.fromFunction1(parseParams))
      __obj.asInstanceOf[Mailgen]
    }
    
    extension [Self <: Mailgen](x: Self) {
      
      inline def setCacheThemes(value: () => Unit): Self = StObject.set(x, "cacheThemes", js.Any.fromFunction0(value))
      
      inline def setGenerate(value: Content => Any): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
      
      inline def setGeneratePlaintext(value: Content => Any): Self = StObject.set(x, "generatePlaintext", js.Any.fromFunction1(value))
      
      inline def setParseParams(value: Any => Any): Self = StObject.set(x, "parseParams", js.Any.fromFunction1(value))
    }
  }
  
  trait Option extends StObject {
    
    var product: Product
    
    var theme: String | CustomTheme
  }
  object Option {
    
    inline def apply(product: Product, theme: String | CustomTheme): Option = {
      val __obj = js.Dynamic.literal(product = product.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: String | CustomTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait Product extends StObject {
    
    var copyright: js.UndefOr[String] = js.undefined
    
    var link: String
    
    var logo: js.UndefOr[String] = js.undefined
    
    var logoHeight: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object Product {
    
    inline def apply(link: String, name: String): Product = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Product]
    }
    
    extension [Self <: Product](x: Self) {
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoHeight(value: String): Self = StObject.set(x, "logoHeight", value.asInstanceOf[js.Any])
      
      inline def setLogoHeightUndefined: Self = StObject.set(x, "logoHeight", js.undefined)
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Table extends StObject {
    
    var columns: js.UndefOr[js.Array[ColumnOptions]] = js.undefined
    
    var data: js.Array[Any]
  }
  object Table {
    
    inline def apply(data: js.Array[Any]): Table = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Table]
    }
    
    extension [Self <: Table](x: Self) {
      
      inline def setColumns(value: js.Array[ColumnOptions]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: ColumnOptions*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
}
