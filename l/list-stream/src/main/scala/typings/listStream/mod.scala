package typings.listStream

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("list-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ListStreamConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("list-stream", JSImport.Namespace)
  @js.native
  open class Class () extends ListStream {
    def this(callback: js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit]) = this()
    def this(options: DuplexOptions) = this()
    def this(options: Unit, callback: js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit]) = this()
    def this(options: DuplexOptions, callback: js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit]) = this()
  }
  
  @js.native
  trait ListStream extends Duplex {
    
    def append(chunk: Any): Unit = js.native
    
    def duplicate(): ListStream = js.native
    
    def get(index: Double): Any = js.native
    
    var length: Double = js.native
  }
  
  @js.native
  trait ListStreamConstructor
    extends StObject
       with ListStreamMethod
       with Instantiable0[ListStream]
       with Instantiable1[
          (/* options */ DuplexOptions) | (/* callback */ js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit]), 
          ListStream
        ]
       with Instantiable2[
          (/* options */ DuplexOptions) | (/* options */ Unit), 
          /* callback */ js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit], 
          ListStream
        ] {
    
    def obj(): ListStream = js.native
    def obj(callback: js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit]): ListStream = js.native
    def obj(options: Unit, callback: js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit]): ListStream = js.native
    def obj(options: DuplexOptions): ListStream = js.native
    def obj(options: DuplexOptions, callback: js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit]): ListStream = js.native
    @JSName("obj")
    var obj_Original: ListStreamMethod = js.native
  }
  
  @js.native
  trait ListStreamMethod extends StObject {
    
    def apply(): ListStream = js.native
    def apply(callback: js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit]): ListStream = js.native
    def apply(options: Unit, callback: js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit]): ListStream = js.native
    def apply(options: DuplexOptions): ListStream = js.native
    def apply(options: DuplexOptions, callback: js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit]): ListStream = js.native
  }
  
  type _To = js.Object & ListStreamConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & ListStreamConstructor = ^
}
