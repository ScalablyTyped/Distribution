package typings.jfs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.jfs.jfsStrings.memory
import typings.jfs.jfsStrings.single
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jfs", JSImport.Namespace)
  @js.native
  class ^[T /* <: Storable */] ()
    extends StObject
       with Instance[T] {
    def this(name: String) = this()
    def this(name: String, opts: Options) = this()
    def this(name: Unit, opts: Options) = this()
  }
  @JSImport("jfs", JSImport.Namespace)
  @js.native
  val ^ : js.Object & JsonFileStore = js.native
  
  @js.native
  trait Instance[T] extends StObject {
    
    def all(cb: js.Function2[/* err */ js.UndefOr[Error], /* all */ js.UndefOr[T], Unit]): Unit = js.native
    
    def allSync(): T = js.native
    
    def delete[K /* <: /* keyof T */ String */](id: K): Unit = js.native
    def delete[K /* <: /* keyof T */ String */](id: K, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def deleteSync[K /* <: /* keyof T */ String */](id: K): Error | Unit = js.native
    
    def get[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K): Unit = js.native
    def get[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K, cb: js.Function2[/* err */ js.UndefOr[Error], /* o */ js.UndefOr[V], Unit]): Unit = js.native
    
    def getSync[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K): V | Error = js.native
    
    def save[V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](o: V): Unit = js.native
    def save[V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](o: V, cb: js.Function2[/* err */ js.UndefOr[Error], /* id */ js.UndefOr[String], Unit]): Unit = js.native
    def save[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K, o: V): Unit = js.native
    def save[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K, o: V, cb: js.Function2[/* err */ js.UndefOr[Error], /* id */ js.UndefOr[K], Unit]): Unit = js.native
    
    def saveSync[V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](o: V): Unit = js.native
    def saveSync[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K, o: V): Unit = js.native
  }
  
  @js.native
  trait JsonFileStore
    extends StObject
       with Instantiable0[Instance[Storable]]
       with Instantiable1[/* name */ String, Instance[Storable]]
       with Instantiable2[(/* name */ String) | (/* name */ Unit), /* opts */ Options, Instance[Storable]]
  
  trait Options extends StObject {
    
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    var saveId: js.UndefOr[Boolean | String] = js.undefined
    
    var `type`: js.UndefOr[single | memory] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setSaveId(value: Boolean | String): Self = StObject.set(x, "saveId", value.asInstanceOf[js.Any])
      
      inline def setSaveIdUndefined: Self = StObject.set(x, "saveId", js.undefined)
      
      inline def setType(value: single | memory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Storable = StringDictionary[js.Any]
  
  type _To = js.Object & JsonFileStore
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & JsonFileStore = ^
}
