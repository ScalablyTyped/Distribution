package typings.listr2.mod

import typings.listr2.anon.Duration
import typings.listr2.listr2Strings.DATA
import typings.listr2.listr2Strings.MESSAGE
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The internal communication event. */
/* Rewritten from type alias, can be one of: 
  - typings.listr2.anon.Data
  - typings.listr2.anon.Type
  - typings.listr2.anon.DataType
*/
trait ListrEvent extends StObject
object ListrEvent {
  
  inline def Data(`type`: Exclude[ListrEventType, MESSAGE | DATA]): typings.listr2.anon.Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.listr2.anon.Data]
  }
  
  inline def DataType(data: Duration, `type`: typings.listr2.mod.ListrEventType.MESSAGE): typings.listr2.anon.DataType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.listr2.anon.DataType]
  }
  
  inline def Type(data: String, `type`: typings.listr2.mod.ListrEventType.DATA): typings.listr2.anon.Type = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.listr2.anon.Type]
  }
}
