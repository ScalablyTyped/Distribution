package typings.listr2.anon

import typings.listr2.listr2Strings.stderr
import typings.listr2.listr2Strings.stdout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  /**
    * choose between process.stdout and process.stderr
    *
    * @default stdout
    */
  var output: js.UndefOr[stdout | stderr] = js.undefined
  
  /**
    * if true this will add
    * timestamp at the begin of the rendered line
    *
    * @example
    *
    * ```bash
    * [12:33:44] ✔ Do something important
    * ```
    *
    * @default false
    */
  var prefixWithTimestamp: js.UndefOr[Boolean] = js.undefined
}
object Output {
  
  inline def apply(): Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    inline def setOutput(value: stdout | stderr): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setPrefixWithTimestamp(value: Boolean): Self = StObject.set(x, "prefixWithTimestamp", value.asInstanceOf[js.Any])
    
    inline def setPrefixWithTimestampUndefined: Self = StObject.set(x, "prefixWithTimestamp", js.undefined)
  }
}
