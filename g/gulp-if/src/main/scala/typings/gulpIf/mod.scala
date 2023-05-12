package typings.gulpIf

import typings.gulpMatch.mod.MatchCondition
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * gulp-if will pipe data to stream whenever condition is truthy.
    * If condition is falsey and elseStream is passed, data will pipe to elseStream
    * After data is piped to stream or elseStream or neither, data is piped down-stream.
    *
    * @param condition whether input should be piped to stream
    * @param stream the stream to pipe to if condition is true
    * @param elseStream (optional) the stream to pipe to if condition is false
    * @param minimatchOptions (optional) the minimatch options when matching glob conditions
    */
  inline def apply(condition: MatchCondition, stream: ReadWriteStream): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    condition: MatchCondition,
    stream: ReadWriteStream,
    elseStream: Unit,
    minimatchOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify minimatch.IOptions */ Any
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], elseStream.asInstanceOf[js.Any], minimatchOptions.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(condition: MatchCondition, stream: ReadWriteStream, elseStream: ReadWriteStream): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], elseStream.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    condition: MatchCondition,
    stream: ReadWriteStream,
    elseStream: ReadWriteStream,
    minimatchOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify minimatch.IOptions */ Any
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], elseStream.asInstanceOf[js.Any], minimatchOptions.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-if", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
