package typings.jsonstream

import typings.jsonstream.jsonstreamBooleans.`false`
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonstream", "parse")
  @js.native
  def parse(pattern: js.Any): ReadWriteStream = js.native
  @JSImport("jsonstream", "parse")
  @js.native
  def parse(patterns: js.Array[_]): ReadWriteStream = js.native
  
  @JSImport("jsonstream", "stringify")
  @js.native
  def stringify(): ReadWriteStream = js.native
  @JSImport("jsonstream", "stringify")
  @js.native
  def stringify(newlineOnly: NewlineOnlyIndicator): ReadWriteStream = js.native
  @JSImport("jsonstream", "stringify")
  @js.native
  def stringify(open: String, sep: String, close: String): ReadWriteStream = js.native
  
  @JSImport("jsonstream", "stringifyObject")
  @js.native
  def stringifyObject(): ReadWriteStream = js.native
  @JSImport("jsonstream", "stringifyObject")
  @js.native
  def stringifyObject(open: String, sep: String, close: String): ReadWriteStream = js.native
  
  type NewlineOnlyIndicator = `false`
  
  @js.native
  trait Options extends StObject {
    
    var recurse: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(recurse: Boolean): Options = {
      val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
    }
  }
}
