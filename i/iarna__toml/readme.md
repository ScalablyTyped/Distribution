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