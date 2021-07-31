package typings.jsonpack

import typings.jsonpack.anon.Floats
import typings.jsonpack.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pack(json: String): DebugObject = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(json.asInstanceOf[js.Any]).asInstanceOf[DebugObject]
  @scala.inline
  def pack(json: String, options: PackDebugOptions): DebugObject = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebugObject]
  @scala.inline
  def pack(json: String, options: PackOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def pack(json: js.Object): DebugObject = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(json.asInstanceOf[js.Any]).asInstanceOf[DebugObject]
  @scala.inline
  def pack(json: js.Object, options: PackDebugOptions): DebugObject = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebugObject]
  @scala.inline
  def pack(json: js.Object, options: PackOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def pack_String(json: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(json.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def pack_String(json: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(json.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def unpack[T](packed: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(packed.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def unpack[T](packed: String, options: PackOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(packed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait DebugObject extends StObject {
    
    var ast: js.Array[Index]
    
    var dictionary: Floats
    
    var packed: String
  }
  object DebugObject {
    
    @scala.inline
    def apply(ast: js.Array[Index], dictionary: Floats, packed: String): DebugObject = {
      val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugObject]
    }
    
    @scala.inline
    implicit class DebugObjectMutableBuilder[Self <: DebugObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAst(value: js.Array[Index]): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstVarargs(value: Index*): Self = StObject.set(x, "ast", js.Array(value :_*))
      
      @scala.inline
      def setDictionary(value: Floats): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacked(value: String): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    }
  }
  
  trait PackDebugOptions
    extends StObject
       with PackOptions {
    
    var debug: js.UndefOr[Boolean] = js.undefined
  }
  object PackDebugOptions {
    
    @scala.inline
    def apply(): PackDebugOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackDebugOptions]
    }
    
    @scala.inline
    implicit class PackDebugOptionsMutableBuilder[Self <: PackDebugOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  trait PackOptions extends StObject {
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object PackOptions {
    
    @scala.inline
    def apply(): PackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackOptions]
    }
    
    @scala.inline
    implicit class PackOptionsMutableBuilder[Self <: PackOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
