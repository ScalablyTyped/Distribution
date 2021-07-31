package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A topic resource.
  */
trait SchemaTopic extends StObject {
  
  /**
    * The name of the topic. It must have the format
    * `&quot;projects/{project}/topics/{topic}&quot;`. `{topic}` must start
    * with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`),
    * dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`)
    * or percent signs (`%`). It must be between 3 and 255 characters in
    * length, and it must not start with `&quot;goog&quot;`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaTopic {
  
  @scala.inline
  def apply(): SchemaTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTopic]
  }
  
  @scala.inline
  implicit class SchemaTopicMutableBuilder[Self <: SchemaTopic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
