
# Scala.js typings for iarna__toml

Typings are for version 2.0

## Library description:
Better TOML parsing and stringifying all in that familiar JSON interface.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | @iarna/toml |
| Keywords           | toml, toml-parser, toml-stringifier, parser, stringifer, emitter, ini, tomlify, encoder, decoder |
| # releases         | 23 |
| # dependents       | 41 |
| # downloads        | 1846386 |
| # stars            | 1 |

## Links
- [Homepage](https://github.com/iarna/iarna-toml#readme)
- [Bugs](https://github.com/iarna/iarna-toml/issues)
- [Repository](https://github.com/iarna/iarna-toml)
- [Npm](https://www.npmjs.com/package/%40iarna%2Ftoml)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for @iarna/toml 2.0
// Project: https://github.com/iarna/iarna-toml#readme
// Definitions by: Klaus Meinhardt <https://github.com/ajafff>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.2
/** Asynchronously parse a TOML string and return a promise of the resulting object. */
/** Synchronously parse a TOML string and return an object. */
/**
 * Serialize an object as TOML.
 *
 * If an object `TOML.stringify` is serializing has a toJSON method then it will call it to transform the object before serializing it.
 * This matches the behavior of JSON.stringify.
 * The one exception to this is that toJSON is not called for Date objects because JSON represents dates as strings and TOML can represent them natively.
 */

```

