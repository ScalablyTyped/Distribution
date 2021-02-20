package typings.httpsnippet

import typings.harFormat.mod.Har
import typings.harFormat.mod.Request
import typings.httpsnippet.anon.Info
import typings.httpsnippet.httpsnippetBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /*~ Write your module's methods and properties in this class */
  @JSImport("httpsnippet", JSImport.Namespace)
  @js.native
  class ^ protected () extends HTTPSnippet {
    def this(data: Data) = this()
  }
  @JSImport("httpsnippet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("httpsnippet", "addTarget")
  @js.native
  def addTarget(target: Target[String]): Unit = js.native
  
  /* static member */
  @JSImport("httpsnippet", "addTargetClient")
  @js.native
  def addTargetClient(target: String, client: TargetClient): Unit = js.native
  
  /* static member */
  @JSImport("httpsnippet", "availableTargets")
  @js.native
  def availableTargets: js.Array[String] = js.native
  @scala.inline
  def availableTargets_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableTargets")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("httpsnippet", "extName")
  @js.native
  def extName(target: String): String = js.native
  
  type Data = Har | Request
  
  /*~ Write your module's methods and properties in this class */
  @js.native
  trait HTTPSnippet extends StObject {
    
    def convert(target: String): String | `false` = js.native
    def convert(target: String, client: js.UndefOr[scala.Nothing], options: Options): String | `false` = js.native
    def convert(target: String, client: String): String | `false` = js.native
    def convert(target: String, client: String, options: Options): String | `false` = js.native
    def convert(target: String, options: Options): String | `false` = js.native
  }
  
  type Options = js.Object
  
  type Target[C /* <: String */] = Info[C] with (Record[C, TargetClient])
  
  @js.native
  trait TargetClient extends StObject {
    
    def apply(source: Request, options: Options): String = js.native
    
    var info: TargetClientInfo = js.native
  }
  
  @js.native
  trait TargetClientInfo extends StObject {
    
    var description: js.UndefOr[String] = js.native
    
    var key: String = js.native
    
    var link: js.UndefOr[String] = js.native
    
    var title: String = js.native
  }
  object TargetClientInfo {
    
    @scala.inline
    def apply(key: String, title: String): TargetClientInfo = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetClientInfo]
    }
    
    @scala.inline
    implicit class TargetClientInfoMutableBuilder[Self <: TargetClientInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TargetInfo[C /* <: String */] extends StObject {
    
    var default: C = js.native
    
    var extname: String = js.native
    
    var key: String = js.native
    
    var title: String = js.native
  }
  object TargetInfo {
    
    @scala.inline
    def apply[C /* <: String */](default: C, extname: String, key: String, title: String): TargetInfo[C] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetInfo[C]]
    }
    
    @scala.inline
    implicit class TargetInfoMutableBuilder[Self <: TargetInfo[_], C /* <: String */] (val x: Self with TargetInfo[C]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: C): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
