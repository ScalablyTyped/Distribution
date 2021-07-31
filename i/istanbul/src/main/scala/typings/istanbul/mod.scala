package typings.istanbul

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("istanbul", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Istanbul {
    def this(options: js.Any) = this()
  }
  @JSImport("istanbul", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Istanbul = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("istanbul", "Collector")
  @js.native
  class CollectorCls ()
    extends StObject
       with Collector {
    def this(options: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("istanbul", "Instrumenter")
  @js.native
  class InstrumenterCls ()
    extends StObject
       with Instrumenter {
    def this(options: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("istanbul", "Reporter")
  @js.native
  class ReporterCls ()
    extends StObject
       with Reporter {
    def this(cfg: Configuration) = this()
    def this(cfg: Unit, dir: String) = this()
    def this(cfg: Configuration, dir: String) = this()
  }
  
  @js.native
  trait Collector
    extends StObject
       with Instantiable0[Collector]
       with Instantiable1[/* options */ js.Any, Collector] {
    
    def add(coverage: js.Any): Unit = js.native
    def add(coverage: js.Any, testName: String): Unit = js.native
    
    def getFinalCoverage(): js.Any = js.native
  }
  
  trait Config extends StObject
  
  @js.native
  trait Configuration
    extends StObject
       with Instantiable2[/* obj */ js.Any, /* overrides */ js.Any, Configuration]
  
  trait ContentWriter extends StObject
  
  trait FileWriter extends StObject
  
  trait Hook extends StObject
  
  @js.native
  trait Instrumenter
    extends StObject
       with Instantiable0[Instrumenter]
       with Instantiable1[/* options */ js.Any, Instrumenter] {
    
    def instrumentSync(code: String, filename: String): String = js.native
  }
  
  @js.native
  trait Istanbul
    extends StObject
       with Instantiable0[Istanbul]
       with Instantiable1[/* options */ js.Any, Istanbul] {
    
    var Collector: typings.istanbul.mod.Collector = js.native
    
    var ContentWriter: typings.istanbul.mod.ContentWriter = js.native
    
    var FileWriter: typings.istanbul.mod.FileWriter = js.native
    
    var Instrumenter: typings.istanbul.mod.Instrumenter = js.native
    
    var Report: typings.istanbul.mod.Report = js.native
    
    var Reporter: typings.istanbul.mod.Reporter = js.native
    
    var Store: typings.istanbul.mod.Store = js.native
    
    var VERSION: String = js.native
    
    var Writer: typings.istanbul.mod.Writer = js.native
    
    var config: Config = js.native
    
    var hook: Hook = js.native
    
    var utils: ObjectUtils = js.native
  }
  
  trait ObjectUtils extends StObject
  
  trait Report extends StObject
  
  @js.native
  trait Reporter
    extends StObject
       with Instantiable0[Reporter]
       with Instantiable1[/* cfg */ Configuration, Reporter]
       with Instantiable2[(/* cfg */ Configuration) | (/* cfg */ Unit), /* dir */ String, Reporter] {
    
    def add(fmt: String): Unit = js.native
    
    def addAll(fmts: js.Array[String]): Unit = js.native
    
    def write(collector: Collector, sync: Boolean, callback: js.Function): Unit = js.native
  }
  
  trait Store extends StObject
  
  trait Writer extends StObject
  
  type _To = js.Object & Istanbul
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Istanbul = ^
}
