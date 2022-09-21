package typings.html5History

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html5-history", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCurrentIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentIndex")().asInstanceOf[Double]
  
  inline def getHash(doc: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHash")(doc.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getState(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")().asInstanceOf[Any]
  inline def getState(friendly: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")(friendly.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getState(friendly: Any, create: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(friendly.asInstanceOf[js.Any], create.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getState(friendly: Unit, create: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(friendly.asInstanceOf[js.Any], create.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getStateByIndex(index: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateByIndex")(index.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def init(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Boolean]
  inline def init(options: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeHash(hash: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHash")(hash.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def setHash(hash: Any, queue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setHash")(hash.asInstanceOf[js.Any], queue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def unescapeHash(hash: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeHash")(hash.asInstanceOf[js.Any]).asInstanceOf[Any]
}
