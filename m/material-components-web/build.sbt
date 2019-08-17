organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-b02921"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-0e6cf5",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-cffd24",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-44c626",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-f057b3",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-39610e",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-b4f371",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-592cd6",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-a777af",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-e29b03",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-d71178",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-b4a83b",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-28cc78",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-d98ac1",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-1c9964",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-f1a9b4",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-6d86b2",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-c0f60f",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-081031",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-4262f8",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-709b52",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-1aa8e0",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-e6db7b",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-3c94d1",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-49ab56",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-028bdd",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        