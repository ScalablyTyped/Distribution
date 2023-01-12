package typings.lineReader

import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reader extends StObject {
  
  def close(cb: js.Function1[/* err */ js.Error, Unit]): Unit
  
  def getReadStream(): ReadableStream
  
  def hasNextLine(): Boolean
  
  def isClosed(): Boolean
  
  def isOpen(): Boolean
  
  def nextLine(cb: js.Function2[/* err */ js.Error, /* line */ js.UndefOr[String], Unit]): Unit
}
object Reader {
  
  inline def apply(
    close: js.Function1[/* err */ js.Error, Unit] => Unit,
    getReadStream: () => ReadableStream,
    hasNextLine: () => Boolean,
    isClosed: () => Boolean,
    isOpen: () => Boolean,
    nextLine: js.Function2[/* err */ js.Error, /* line */ js.UndefOr[String], Unit] => Unit
  ): Reader = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), getReadStream = js.Any.fromFunction0(getReadStream), hasNextLine = js.Any.fromFunction0(hasNextLine), isClosed = js.Any.fromFunction0(isClosed), isOpen = js.Any.fromFunction0(isOpen), nextLine = js.Any.fromFunction1(nextLine))
    __obj.asInstanceOf[Reader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reader] (val x: Self) extends AnyVal {
    
    inline def setClose(value: js.Function1[/* err */ js.Error, Unit] => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setGetReadStream(value: () => ReadableStream): Self = StObject.set(x, "getReadStream", js.Any.fromFunction0(value))
    
    inline def setHasNextLine(value: () => Boolean): Self = StObject.set(x, "hasNextLine", js.Any.fromFunction0(value))
    
    inline def setIsClosed(value: () => Boolean): Self = StObject.set(x, "isClosed", js.Any.fromFunction0(value))
    
    inline def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
    
    inline def setNextLine(value: js.Function2[/* err */ js.Error, /* line */ js.UndefOr[String], Unit] => Unit): Self = StObject.set(x, "nextLine", js.Any.fromFunction1(value))
  }
}
