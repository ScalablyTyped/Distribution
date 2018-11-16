package typings
package gruntLib.minimatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A minimal matching utility options.
     *
     * This is the matching library used internally by npm.
     * Eventually, it will replace the C binding in node-glob.
     * It works by converting glob expressions into JavaScript RegExp objects.
     */

trait IMinimatchOptions extends js.Object {
  /*
           All options are false by default.
           */
  
  /**
           * Dump a ton of stuff to stderr.
           */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Allow patterns to match filenames starting with a period,
           * even if the pattern does not explicitly have a period in that spot.
           */
  // Note that by default, a/**\/b will not match a/.d/b, unless dot is set.
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Returns from negate expressions the same as if they were not negated. (Ie, true on a hit, false on a miss.)
           */
  var flipNegate: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If set, then patterns without slashes will be matched against the basename of the path if it contains slashes.
           * For example, a?b would match the path /xyz/123/acb, but not /xyz/acb/123.
           */
  var matchBase: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Do not expand {a,b} and {1..3} brace sets.
           */
  var nobrace: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Perform a case-insensitive match.
           */
  var nocase: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Suppress the behavior of treating # at the start of a pattern as a comment.
           */
  var nocomment: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Disable "extglob" style patterns like +(a|b).
           */
  var noext: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Disable ** matching against multiple folder names.
           */
  var noglobstar: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Suppress the behavior of treating a leading ! character as negation.
           */
  var nonegate: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When a match is not found by minimatch.match, return a list containing the pattern itself.
           * When set, an empty list is returned if there are no matches.
           */
  var nonull: js.UndefOr[scala.Boolean] = js.undefined
}

