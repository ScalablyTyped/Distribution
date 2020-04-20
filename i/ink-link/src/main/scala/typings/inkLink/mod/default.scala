package typings.inkLink.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
An Ink component that creates clickable links in the terminal.
[Supported terminals.](https://gist.github.com/egmontkob/eb114294efbcd5adb1944c9f3cb5feda)
For unsupported terminals, the link will be printed in parens after the text: `My website (https://sindresorhus.com)`.
@example
```
import React from 'react';
import {render, Color} from 'ink';
import Link from 'ink-link';
render(
	<Link url="https://sindresorhus.com">
		My <Color cyan>Website</Color>
	</Link>
);
```
*/
@JSImport("ink-link", JSImport.Default)
@js.native
object default extends TopLevel[FC[Props]]

