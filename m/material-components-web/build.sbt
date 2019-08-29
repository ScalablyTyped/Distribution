organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-e1d99a"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-190b31",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-18f0b9",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-8cdb1c",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-b4d277",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-4bbc38",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-c5ee6e",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-fa9daf",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-4068a3",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-a5cb23",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-ab367a",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-51bf14",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-4e629f",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-b1fdfe",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-322cd2",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-ff43f0",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-515f26",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-2252a0",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-7533ea",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-7519d2",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-934b3b",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-eff588",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-58d85b",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-f17377",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-4cf335",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-ed6002",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        