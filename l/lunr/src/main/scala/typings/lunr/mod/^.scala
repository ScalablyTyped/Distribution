package typings.lunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lunr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Convenience function for instantiating a new lunr index and configuring it with the default
    * pipeline functions and the passed config function.
    *
    * When using this convenience function a new index will be created with the following functions
    * already in the pipeline:
    *
    *  * lunr.StopWordFilter - filters out any stop words before they enter the index
    *
    *  * lunr.stemmer - stems the tokens before entering the index.
    *
    * Example:
    *
    * ```javascript
    *   var idx = lunr(function () {
    *     this.field('title', 10);
    *     this.field('tags', 100);
    *     this.field('body');
    *
    *     this.ref('cid');
    *
    *     this.pipeline.add(function () {
    *         // some custom pipeline function
    *     });
    *   });
    * ```
    */
  def apply(config: ConfigFunction): Index = js.native
}

