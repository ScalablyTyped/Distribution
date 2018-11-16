```
// Type definitions for koa-hbs v1.x
// Project: https://github.com/gilt/koa-hbs
// Definitions by: Jacob Malone <https://github.com/jcbmln>, Mudkip <https://github.com/mudkipme>
// Definitions: https://github.com/jcbmln/DefinitelyTyped
// TypeScript Version: 2.3
/* =================== USAGE ===================

    import * as Koa from "koa";
....import hbs = require("koa-hbs");

    var app = new Koa();

    app.use(hbs.middleware({
        viewPath: __dirname + '/views'
    }));

    app.use(async (ctx, next) => {
        await ctx.render('main', {
            title: 'koa-hbs'
        });
    });

 =============================================== */

```