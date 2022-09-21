package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobStorage extends StObject {
  
  def init(): js.Promise[Any]
  
  def read(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Any
  
  def registerProvider(provider: Any): Unit
  
  def remove(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): js.Promise[Any]
  
  def write(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Any
}
object BlobStorage {
  
  inline def apply(
    init: () => js.Promise[Any],
    read: Any => Any,
    registerProvider: Any => Unit,
    remove: Any => js.Promise[Any],
    write: Any => Any
  ): BlobStorage = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), read = js.Any.fromFunction1(read), registerProvider = js.Any.fromFunction1(registerProvider), remove = js.Any.fromFunction1(remove), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[BlobStorage]
  }
  
  extension [Self <: BlobStorage](x: Self) {
    
    inline def setInit(value: () => js.Promise[Any]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setRead(value: Any => Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setRegisterProvider(value: Any => Unit): Self = StObject.set(x, "registerProvider", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Any => js.Promise[Any]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setWrite(value: Any => Any): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
